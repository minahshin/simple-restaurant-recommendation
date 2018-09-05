package com.sookmyung.fulfillment.jsonformat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class ResponseForm {
	private String speech;
	private String displayText;
//	private ArrayList<HashMap<String, Object>> messages = new ArrayList<HashMap<String, Object>>();
//	private HashMap<String, Object> data = new HashMap<String, Object>();
//	private ArrayList<ContextInfo> contextOut = new ArrayList<ContextInfo>();
	private String source = "sookmyung_meal_recommendation";
//	private HashMap<String, Object> followupEvent = new HashMap<String, Object>();
}
