package com.sookmyung.fulfillment.jsonformat;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.Data;

@Data
public class ResultMessage {
	private String source;
	private String resolvedQuery;
	private String speech;
	private String action;
	private Boolean actionIncomplete;
	private HashMap<String, Object> parameters = new HashMap<String, Object>();
	
	private ArrayList<ContextInfo> contexts = new ArrayList<ContextInfo>();
	
	private HashMap<String, Object> metadata = new HashMap<String, Object>();
	
	FulfillmentMessage fulfillment = new FulfillmentMessage();
	
	private int score;
}
