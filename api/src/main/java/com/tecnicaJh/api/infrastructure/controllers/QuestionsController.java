package com.tecnicaJh.api.infrastructure.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecnicaJh.api.application.services.QuestionsService;
import com.tecnicaJh.api.infrastructure.entities.Questions;

@RestController
@RequestMapping(path = "api/Questions")
public class QuestionsController {
    @Autowired
    QuestionsService questionsService;

    @GetMapping
    public List<Questions> getQuestions(){
        return questionsService.getQuestions();
    }

    @GetMapping("/{category}")
    public List<Questions> getQuestByCategory(@PathVariable("category") String category){
        return questionsService.getQuestByCategory(category);
    }

    @PostMapping
    public void saveQuestion(@RequestBody Questions questions){
        questionsService.saveQuestion(questions);
    }

    @DeleteMapping("/{questionID}")
    public void deleteQuestion(@PathVariable("questionID") Long questionID){
        questionsService.deleteQuestion(questionID);
    }
}