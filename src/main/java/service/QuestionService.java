package service;

import model.Option;
import model.Question;
import model.dao.OptionDao;
import model.dao.QuestionDao;

import java.util.ArrayList;

public class QuestionService implements IQuestionService {
    public QuestionService() {
    }

    /**
     * @param category 
     * @return
     */
    @Override
    public Question getRandomQuestion(Integer category) {
        QuestionDao questionDao=new QuestionDao();
        Question question=new Question("");
        if(questionDao.findQuestionByCategory(category, question)){
            return question;
        }
        System.out.println("Error, it was not possible to find a question in that category");
        return null;
    }

    /**
     * @param question 
     * @return
     */
    @Override
    public  ArrayList<Option> getOptionsByQuestion(Question question) {
        OptionDao optionDao=new OptionDao();
        ArrayList<Option> options=new ArrayList<>();
        if(optionDao.getOptionsByQuestionId(options, question.getId())){
            return options;
        }
        System.out.println("Error, it was not possible to find the options for that question");
        return null;
    }
}
