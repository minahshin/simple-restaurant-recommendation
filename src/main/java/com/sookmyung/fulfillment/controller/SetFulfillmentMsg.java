package com.sookmyung.fulfillment.controller;

import java.util.ArrayList;
import java.util.HashMap;

import com.sookmyung.fulfillment.jsonformat.*;

public class SetFulfillmentMsg {
	public ResponseForm setMsg() {
		ResponseForm res = new ResponseForm();
		
//		HashMap<String, Object> type0 = new HashMap<String, Object>();
//		type0.put("type", 0);
//		type0.put("speech", "이것은 messages의 speech입니다.");
		
		res.setSpeech("이것은 speech 입니다");
		res.setDisplayText("이것은 displaytext입니다");
//		res.getMessages().add(type0);
		
		return res;
	}
	
}
