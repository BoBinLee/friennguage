package kr.friennguage.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FL0005 {
	@JsonProperty("location_id")
	public int locationId;
	@JsonProperty("parent_id")
	public int parentId;
	public int depth;
	
	public List<Data> locations;
	
	public static class Data {
		@JsonProperty("location_id")
		public int locationId;
		@JsonProperty("parent_id")
		public int parentId;
		public String name;
		public int depth;
	}
}
