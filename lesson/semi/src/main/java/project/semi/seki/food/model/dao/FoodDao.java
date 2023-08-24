package project.semi.seki.food.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.semi.seki.food.model.vo.FoodVo;

@Repository
public class FoodDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<FoodVo> selectList(){
		return sqlSession.selectList("foodMapper.selectList");
	}
}
