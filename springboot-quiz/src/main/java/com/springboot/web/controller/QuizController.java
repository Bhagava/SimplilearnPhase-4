package com.springboot.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.web.model.Quiz;
import com.springboot.web.service.QuizService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class QuizController {
	
	@Autowired
	QuizService quizService;
	
	@GetMapping("/all")
	public List<Quiz> getAllQuizQuestions()
	{
		return quizService.getAllQuizQuestions();
	}
//	@RequestMapping(value="/all", method=RequestMethod.GET)
//	public String showQuestions(ModelMap model)
//	{
//		model.put("ques", quizService.getAllQuizQuestions());
//		return "questions";
//	}
}
