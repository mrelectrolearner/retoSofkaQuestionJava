package service;

import model.Option;
import model.Question;

import java.util.ArrayList;

public interface IQuestionService {




    Question getRandomQuestion(Integer category);

    /**
     * get the list of options for a question.
     */
    ArrayList<Option> getOptionsByQuestion(Question question);


}
