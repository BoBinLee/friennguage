package kr.friennguage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FL0002 {
	public String token;
	@JsonProperty("user_id")
	public long userId;
	
	public String name;
	public String sex;
	public String age;
	public String job;
	@JsonProperty("img_url")
	public String imgUrl;
	@JsonProperty("my_lang_id")
	public long myLangId;
	@JsonProperty("favor_lang_id")
	public long favorLangId;
	@JsonProperty("location_id")
	public long locationId;
	public String intro;
}
