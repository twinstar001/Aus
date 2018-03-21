package com.ktds.Aus.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.Aus.service.AusService;
import com.ktds.Aus.vo.AusVO;

@Controller
public class AusController {
	
	private AusService ausService;
	
	public void setAusService(AusService ausService) {
		this.ausService = ausService;
	}
	
	@RequestMapping("/") 
	public ModelAndView viewMainPage() {
		
		ModelAndView view = new ModelAndView();
		view.setViewName("aus/main");
		
		List<AusVO> ausList = ausService.getAll();
		view.addObject("ausList", ausList);
		
		return view;
		
	}
	
	
		
}
