package com.sookmyung.fulfillment.db.restaurant;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantDAOService implements RestaurantDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Restaurant> getRestaurants() throws Exception {
		RestaurantMapper mapper = sqlSession.getMapper(RestaurantMapper.class);
		return mapper.getRestaurants();
	}
	
	@Override
	public Restaurant getRestaurantByLocationMenu(@Param("longitude") double longitude, @Param("latitude") double latitude
			, @Param("menu") String menu, @Param("distance") double distance) throws Exception{
		RestaurantMapper mapper = sqlSession.getMapper(RestaurantMapper.class);
		return mapper.getRestaurantByLocationMenu(longitude, latitude, menu, distance);
	}
	
	@Override
	public Restaurant getRestaurantByLocationTimeBigCategory(@Param("longitude") double longitude, @Param("latitude") double latitude, 
			@Param("time") String time, @Param("big_category") String big_category, @Param("distance") double distance) throws Exception{
		RestaurantMapper mapper = sqlSession.getMapper(RestaurantMapper.class);
		return mapper.getRestaurantByLocationTimeBigCategory(longitude, latitude, time, big_category, distance);	
	}
	
	@Override
	public Restaurant getRestaurantByLocationSmallCategory(@Param("longitude") double longitude, @Param("latitude") double latitude
			, @Param("small_category") String small_category, @Param("distance") double distance) throws Exception{
		RestaurantMapper mapper = sqlSession.getMapper(RestaurantMapper.class);
		return mapper.getRestaurantByLocationSmallCategory(longitude, latitude, small_category, distance);
	}
	
	@Override
	public Restaurant getRestaurantByTime(String time) throws Exception {
		RestaurantMapper mapper = sqlSession.getMapper(RestaurantMapper.class);
		return mapper.getRestaurantByTime(time);
	}
}
