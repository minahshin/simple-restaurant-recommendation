package com.sookmyung.fulfillment;

import com.sookmyung.fulfillment.control.IntentHandler;
import com.sookmyung.fulfillment.db.category.CategoryDAOService;
import com.sookmyung.fulfillment.db.restaurant.RestaurantDAOService;
import com.sookmyung.fulfillment.jsonformat.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ChatbotController {
	
	@Autowired
	private RestaurantDAOService resDAO;
	
	@Autowired
	private CategoryDAOService cateDAO;
	
	ResponseForm res = new ResponseForm();
	
	@RequestMapping(value = "/sendMsg", method = RequestMethod.POST)
	@ResponseBody
	public ResponseForm sendMsg(@RequestBody final RequestForm req) throws Exception {
		IntentHandler handler = new IntentHandler(resDAO, cateDAO);
		
		res = handler.chooseIntent(req);
		
		return res;
	}
	
}
