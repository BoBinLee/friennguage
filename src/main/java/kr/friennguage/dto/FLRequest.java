package kr.friennguage.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FLRequest<T> {
	@JsonProperty("_tran_cd")
	public String tranCd;
	@JsonProperty("_tran_data")
	public T tranData;
	
	public static enum Code {
		FL0001, FL0002, FL0003, FL0004, FL0005, FL0006, FL0007, PS0001, PS0002, FL0008
	}
}
