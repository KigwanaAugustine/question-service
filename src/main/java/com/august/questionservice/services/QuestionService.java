package com.august.questionservice.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.august.questionservice.daos.QuestionDao;
import com.august.questionservice.models.Question;


@Service
public class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }
    
    public Question getQuestion(Integer id) {
        return questionDao.findById(id).orElse(null);
    }
    
    public List<Question> getQuestionsByCategory(String categoryName) {
        return questionDao.findAllByCategory(categoryName);
    }
    public Question createQuestion(Question question) {
        return questionDao.save(question);
    }

    public Question updateQuestion(Question updatedQuestion) {
        return questionDao.save(updatedQuestion);
    }

    public void deleteQuestion(Integer id) {
        questionDao.deleteById(id);
    }

}
