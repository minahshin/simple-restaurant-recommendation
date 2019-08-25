package com.sookmyung.fulfillment.db.restaurant;

import lombok.Data;

@Data
public class Restaurant {
	int id;
	String name;
	String big_category;
	String small_category;
	String address;
	double longitude;
	double latitude;
	String time;
	String menu;
}
