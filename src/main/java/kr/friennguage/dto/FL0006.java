package kr.friennguage.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FL0006 {
	@JsonProperty("location_id")
	public int locationId;
	@JsonProperty("lang_id")
	public int langId;
	public String title;
	
	public List<Data> groups;
	public static class Data {
		@JsonProperty("user_id")
		public long userId;
		public String user;
		@JsonProperty("location_id")
		public int locationId;
		public String location;
		@JsonProperty("lang_id")
		public int langId;
		public String lang;
		public String title;
		public String content;
		public List<Apply> applies;
		public static class Apply {
			String name;
		}
	}
}
