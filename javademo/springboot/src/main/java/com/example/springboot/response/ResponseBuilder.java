package com.example.springboot.response;

public class ResponseBuilder {
	public static ResponseData build(int code, String message, Object object) {
		ResponseData data = new ResponseData();
		data.data = object;
		data.code = code;
		data.message = message;
		return data;
	}
}
