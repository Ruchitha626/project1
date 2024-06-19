package com.example.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Dao.OptionsDao;
import com.example.Dao.QuestionsDao;
import com.example.Dao.SurveyDao;

import com.example.Entity.Options;
import com.example.Entity.Questions;
import com.example.Entity.Survey;

@Service
public class SurveyImpl implements SurveyInterface{
	
	@Autowired SurveyDao dao1;
	@Autowired QuestionsDao dao2;
	@Autowired OptionsDao dao3;

	@Override
	public Survey insertSurvey(Survey survey) {
		return dao1.save(survey);
	}

	@Override
	public List<Survey> findSurvey() {
		return dao1.findAll();
	}

	@Override
	public Questions insertQuestion(Questions questions) {
		return dao2.save(questions); 
	}

	@Override
	public List<Questions> findQuestions() {
		return dao2.findAll();
	}

	@Override
	public Options insertOptions(Options options) {
		return dao3.save(options);
	}

	@Override
	public List<Options> findOptions() {
		return dao3.findAll();
	}

}
