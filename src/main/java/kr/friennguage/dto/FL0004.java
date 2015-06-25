package kr.friennguage.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FL0004 {
	@JsonProperty("lang_id")
	public int langId;
	
	public List<Data> langs;
	
	public static class Data {
		@JsonProperty("lang_id")
		public int langId;
		public String name;
	}
}
