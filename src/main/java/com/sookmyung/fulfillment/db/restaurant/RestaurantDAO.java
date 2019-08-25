package com.sookmyung.fulfillment.db.restaurant;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RestaurantDAO {
	public List<Restaurant> getRestaurants() throws Exception;
	public Restaurant getRestaurantByLocationMenu(@Param("longitude") double longitude, @Param("latitude") double latitude
			, @Param("menu") String menu, @Param("distance") double distance) throws Exception;
	public Restaurant getRestaurantByLocationTimeBigCategory(@Param("longitude") double longitude, @Param("latitude") double latitude
			, @Param("time") String time, @Param("big_category") String big_category, @Param("distance") double distance) throws Exception;
	public Restaurant getRestaurantByLocationSmallCategory(@Param("longitude") double longitude, @Param("latitude") double latitude
			, @Param("small_category") String small_category, @Param("distance") double distance) throws Exception;
	public Restaurant getRestaurantByTime(String time) throws Exception;
}
