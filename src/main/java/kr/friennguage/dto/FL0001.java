package kr.friennguage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FL0001 {
	public String email;
	public String password;

	public String token;
	@JsonProperty("user_id")
	public long userId;
}
