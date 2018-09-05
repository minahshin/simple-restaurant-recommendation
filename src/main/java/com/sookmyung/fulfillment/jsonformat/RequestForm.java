package com.sookmyung.fulfillment.jsonformat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class RequestForm {
	private HashMap<String, Object> originalRequest = new HashMap<String, Object>();
	private String id;
	private String sessionId;
	private String timestamp;
	private String timezone;
	private String lang;
	
	ResultMessage result = new ResultMessage();
}