package com.example.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.Options;
import com.example.Entity.Questions;
import com.example.Entity.Survey;
import com.example.Service.SurveyInterface;

@RestController
@RequestMapping("/survey")
public class SurveyController {
	
	@Autowired SurveyInterface surveyinterface;
	
	@PostMapping("/insertSurvey")
	public Survey insert(@RequestBody Survey survey)
	{
		return surveyinterface.insertSurvey(survey);
	}
	
	@GetMapping("/getSurvey")
	public List<Survey> getAll(){
		return surveyinterface.findSurvey();
	}
	
	@PostMapping("/insertQuestions")
	public Questions insert1(@RequestBody Questions question)
	{
		return surveyinterface.insertQuestion(question);
	}
	
	@GetMapping("/getQuestions")
	public List<Questions> getAll1(){
		return surveyinterface.findQuestions();
	}
	
	@PostMapping("/insertOptions")
	public Options insert2(@RequestBody Options answer)
	{
		return surveyinterface.insertOptions(answer);
	}
	
	@GetMapping("/getOptions")
	public List<Options> getAll2(){
		return surveyinterface.findOptions();
	}

}
