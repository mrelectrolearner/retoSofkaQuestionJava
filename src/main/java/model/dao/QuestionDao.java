package model.dao;

import model.Question;

/**
 * Represent the question Dao, allowing to interact with the database
 *
 * @author
 * @version 1.0.0 2022-04-22.
 * @since 1.0.0 2022-04-22.
 */
public class QuestionDao {
    private OptionDao optionDao = new OptionDao();

    public QuestionDao() {
    }

   /* public Question getQuestionByCategory(Integer category) {
        return new Question();
    }

    ;*/

    /*private Integer getQuestionIdByQuestion(String question) {
        return 0;
    }*/

    public Boolean saveQuestion(Question question) {
        return false;
    }


}
