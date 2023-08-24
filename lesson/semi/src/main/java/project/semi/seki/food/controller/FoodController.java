package project.semi.seki.food.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import project.semi.seki.food.model.service.FoodService;

@Controller
public class FoodController {
	@Autowired
	private FoodService service;
	@GetMapping("/food/list")
	public String list(Model model) {
		model.addAttribute("foodList",service.slelctList());
		return "/food/list";
	}
}
