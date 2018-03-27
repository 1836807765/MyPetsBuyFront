package com.pets.utils;

public class AjaxResult {
	private String status;// 是否处理成功。ok、error
	private String msg;// 错误消息
	private Object data;
	
	public AjaxResult(String status)
	{
		super();
		this.status = status;
	}
	
	public AjaxResult(String status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	public AjaxResult(String status, String msg, Object data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return CommonUtils.createGson().toJson(this);
	}
	
	public String toJson()
	{
		return this.toString();
	}
}
