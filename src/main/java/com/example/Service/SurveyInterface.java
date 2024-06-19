package com.example.Service;

import java.util.List;


import com.example.Entity.Options;
import com.example.Entity.Questions;
import com.example.Entity.Survey;

public interface SurveyInterface {
	
	public Survey insertSurvey(Survey survey);
	public List<Survey> findSurvey();
	
	public Questions insertQuestion(Questions questions);
	public List<Questions> findQuestions();
	
	public Options insertOptions(Options options);
	public List<Options> findOptions();
	

}
