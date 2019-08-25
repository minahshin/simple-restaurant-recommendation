package com.sookmyung.fulfillment.db.category;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDAOService implements CategoryDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public Category getCategoryByWeather(String weather) throws Exception {
		CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
		return mapper.getCategoryByWeather(weather);
	}
}
