package com.moji.util.zeromq;

import com.google.gson.annotations.Expose;

public class ZeroMqResBean {
	@Expose
	private Integer code;
	@Expose
	private String msg;
	
	private String aa;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}	
}
