package com.spring.matrixgenerator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.matrixgenerator.models.Numbers;
import com.spring.matrixgenerator.service.MatrixGeneratorService;

@Controller
public class MatrixController {
	
	@Autowired
	MatrixGeneratorService MatrixService;
	
	@RequestMapping(value = "/index")
	public String index() {
		 
		return "index";
		
	}
	
	@RequestMapping(value = "/matrixgenerator", method = RequestMethod.GET)
	public ModelAndView generateMatrix(Numbers numbers) {
	
		ModelAndView modelAndView = new ModelAndView("matrixgenerator");

		 modelAndView.addObject("values", MatrixService.generateMatrix(numbers));
		 modelAndView.setViewName("matrixgenerator");
		return modelAndView;
		
	}
	@RequestMapping(value = "/matrixgenerator", method = RequestMethod.POST)
	public String generateMatrixForm(Numbers numbers) {
		MatrixService.generateMatrix(numbers);
		return "matrixgenerator";
		
	}

}
