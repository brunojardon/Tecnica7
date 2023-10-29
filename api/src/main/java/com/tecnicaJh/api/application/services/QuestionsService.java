package com.tecnicaJh.api.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tecnicaJh.api.infrastructure.repositories.QuestionsRepository;
import com.tecnicaJh.api.infrastructure.entities.Questions;

@Service
public class QuestionsService {

    // Obtiene toda la informacion de la tabla Questions
    @Autowired
    QuestionsRepository questionsRepository;
    public List<Questions> getQuestions(){
        return questionsRepository.findAll();
    }

    // Filtra por categoria
    public List<Questions> getQuestByCategory(String category) {
        return questionsRepository.findByCategory(category);
    }

    // Guarda la pregunta en la DB Questions
    public void saveQuestion(Questions questions){
        questionsRepository.save(questions);
    }

    // Borra una pregunta segun su id
    public void deleteQuestion(Long id){
        questionsRepository.deleteById(id);
    }
}
