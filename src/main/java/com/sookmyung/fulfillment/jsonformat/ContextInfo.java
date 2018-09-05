package com.sookmyung.fulfillment.jsonformat;

import java.util.HashMap;

import lombok.Data;

@Data
public class ContextInfo {
	private String name;
	private HashMap<String, Object> parameters = new HashMap<String, Object>();
	private int lifespan;
}
