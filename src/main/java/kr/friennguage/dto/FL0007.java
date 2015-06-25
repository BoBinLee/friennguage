package kr.friennguage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FL0007 {
	public String token;
	@JsonProperty("location_id")
	public int locationId;
	@JsonProperty("lang_id")
	public int langId;
	public String title;
	public String content;
	
	public String res;
}
