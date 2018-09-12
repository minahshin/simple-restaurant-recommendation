package com.sookmyung.fulfillment.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sookmyung.fulfillment.jsonformat.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Controller
public class ChatbotController {
	
	@RequestMapping(value = "/sendMsg", method = RequestMethod.POST)
	@ResponseBody
	public ResponseForm sendMsg(@RequestBody final RequestForm req) {
		ResponseForm res = new ResponseForm();
		SetFulfillmentMsg setting = new SetFulfillmentMsg();

	//	res = setting.setMsg();
	
		res.setDisplayText("fulfillment");
		res.setSpeech("fulfillment");
		
		return res;
	}
	
}
