package com.sookmyung.fulfillment.jsonformat;


import java.util.HashMap;
import lombok.Data;

@Data
public class RequestForm {
	private String id;
	private String sessionId;
	private String timestamp;
	private String lang;
	private HashMap<String, String> status = new HashMap<String, String>();
	private HashMap<String, Object> originalRequest = new HashMap<String, Object>();
	
	ResultMessage result = new ResultMessage();
}