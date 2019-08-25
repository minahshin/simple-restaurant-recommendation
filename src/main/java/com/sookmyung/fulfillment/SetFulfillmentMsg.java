package com.sookmyung.fulfillment;

import com.sookmyung.fulfillment.jsonformat.*;

public class SetFulfillmentMsg {
	public ResponseForm setMsg(String speech, String displayText) throws Exception {
		ResponseForm res = new ResponseForm();
		
		res.setSpeech(speech);
		res.setDisplayText(displayText);
		
		return res;
	}
	
}
