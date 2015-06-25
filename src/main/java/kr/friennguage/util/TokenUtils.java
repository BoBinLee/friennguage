package kr.friennguage.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import kr.friennguage.domain.User;

import org.springframework.security.crypto.codec.Hex;


public class TokenUtils
{

	public static final String MAGIC_KEY = "obfuscate";

	public static String createToken(User user)
	{
		/* Expires in one hour */
		long expires = System.currentTimeMillis() + 1000L * 60 * 60;

		StringBuilder tokenBuilder = new StringBuilder();
		tokenBuilder.append("" + user.getUserId());
		tokenBuilder.append(":");
		tokenBuilder.append(expires);
		tokenBuilder.append(":");
		tokenBuilder.append(TokenUtils.computeSignature(user, expires));

		return tokenBuilder.toString();
	}


	public static String computeSignature(User user, long expires)
	{
		StringBuilder signatureBuilder = new StringBuilder();
		signatureBuilder.append("" + user.getUserId());
		signatureBuilder.append(":");
		signatureBuilder.append(expires);
		signatureBuilder.append(":");
		signatureBuilder.append(user.getPassword());
		signatureBuilder.append(":");
		signatureBuilder.append(TokenUtils.MAGIC_KEY);

		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalStateException("No MD5 algorithm available!");
		}

		return new String(Hex.encode(digest.digest(signatureBuilder.toString().getBytes())));
	}


	public static Long getUserIdFromToken(String authToken)
	{
		if (null == authToken) {
			return null;
		}

		String[] parts = authToken.split(":");
		return Long.parseLong(parts[0]);
	}


	public static boolean validateToken(String authToken, User user)
	{
		String[] parts = authToken.split(":");
		long expires = Long.parseLong(parts[1]);
		String signature = parts[2];

	/*	if (expires < System.currentTimeMillis()) {
			return false;
		}*/
		return signature.equals(TokenUtils.computeSignature(user, expires));
	}
}