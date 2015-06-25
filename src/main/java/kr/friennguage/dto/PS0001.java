package kr.friennguage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PS0001 {
	public String token;
	@JsonProperty("push_token_id")
	public String pushTokenId;
	@JsonProperty("push_yn")
	public String pushYn;
	
	@JsonProperty("res")
	public String resultYn;
}
