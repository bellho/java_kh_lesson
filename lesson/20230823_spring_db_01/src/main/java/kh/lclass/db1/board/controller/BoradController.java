package kh.lclass.db1.board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import kh.lclass.db1.board.model.service.BoardService;


@Controller
public class BoradController {
	@Autowired
	private BoardService boardService;
	
	@GetMapping("/borad/list")
	public String list(Model model) {
		model.addAttribute("boardList",boardService.selectList());
		return "/borad/list";
	}
}
