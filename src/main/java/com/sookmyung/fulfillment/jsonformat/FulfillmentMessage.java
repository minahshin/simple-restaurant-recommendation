package com.sookmyung.fulfillment.jsonformat;

import java.util.ArrayList;
import java.util.HashMap;

import lombok.Data;

@Data
public class FulfillmentMessage {
	private String speech;
	private ArrayList<HashMap<String, Object>> messages = new ArrayList<HashMap<String, Object>>();
}
