package kr.friennguage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FL0003 {
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
	@JsonProperty("favor_location_id")
	public long favorLocationId;
	@JsonProperty("favor_lang_id")
	public long favorLangId;
	public String intro;
	
	public String res;
}
