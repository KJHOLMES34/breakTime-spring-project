package com.kh.breaktime.decide.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kh.breaktime.decide.model.service.DecideService;
import com.kh.breaktime.detail.controller.DetailController;

@Controller
@RequestMapping("/decide")
public class DecideController {
	
	private DecideService decideService;
	
	private static final Logger logger = LoggerFactory.getLogger(DecideController.class);
	
	@Autowired
	public void setDecideService(DecideService decideService) {
		this.decideService = decideService;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/demain") 
	public String decideMain() {

		return "decide/decideMain";
	}
	
	@GetMapping("/deroom") 
	public String decideRoomSelect() {

		return "decide/decideRoomSelect";
	}
	
	@GetMapping("/demap") 
	public String decideMainMap() {

		return "decide/decideMainMap";
	}
	
	@GetMapping("/dereview") 
	public String decideReview() {

		return "decide/decideReview";
	}
	
	@GetMapping("/dedate") 
	public String decideDateSelect() {

		return "decide/decideDateSelect";
	}
	
	@GetMapping("/debasket") 
	public String decideBasket() {

		return "decide/decideBasket";
	}

}
