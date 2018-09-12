package com.sookmyung.fulfillment.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.sookmyung.fulfillment.jsonformat.*;

public class SetFulfillmentMsg {
	public ResponseForm setMsg() {
		ResponseForm res = new ResponseForm();
		FulfillmentMsgInfo ful = new FulfillmentMsgInfo();
		
		/*
		HashMap<String, Object> type0 = new HashMap<String, Object>();
		type0.put("type", 0);
		type0.put("speech", "fulfillment");
		*/
		
		ful.setSpeech("speech");
		ful.setType(0);
		
//		res.getMessages().add(ful);
		
//		res.setSpeech("speech");
//		res.setDisplayText("speech");
//		res.getMessages().add(type0);
		
		/*
		ArrayList<String> text = new ArrayList<String>();
		HashMap<String, Object> textDepth2 = new HashMap<String, Object>(); 
		HashMap<String, Object> textDepth1 = new HashMap<String, Object>();
		
		text.add("흠좀무");
		
		textDepth2.put("text", text);
		textDepth1.put("text", textDepth2);
		
		res.getFulfillmentMessages().add(textDepth1);
		*/
		return res;
	}
	
}
