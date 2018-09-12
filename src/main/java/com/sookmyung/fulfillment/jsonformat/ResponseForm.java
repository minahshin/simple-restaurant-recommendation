package com.sookmyung.fulfillment.jsonformat;


import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Map;

import lombok.Data;

@Data
public class ResponseForm {
	
	/*
	@SerializedName("messages")
	private ArrayList<FulfillmentMsgInfo> messages = new ArrayList<FulfillmentMsgInfo>();
	*/
//	private ArrayList<HashMap<String,Object>> fulfillmentMessages = new ArrayList<HashMap<String,Object>>();
	
	@SerializedName("speech")
	private String speech;
	
	@SerializedName("displayText")
	private String displayText;
	
	@SerializedName("contextOut")
	private ArrayList<ContextInfo> contextOut = new ArrayList<ContextInfo>();
}
