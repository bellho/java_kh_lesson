package project.semi.seki.food.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.semi.seki.food.model.dao.FoodDao;
import project.semi.seki.food.model.vo.FoodVo;

@Service
public class FoodService {
	@Autowired
	private FoodDao dao;
	
	public List<FoodVo> slelctList() {
		return dao.selectList();
	}
}
