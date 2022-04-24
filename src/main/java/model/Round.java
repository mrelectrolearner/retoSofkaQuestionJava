package model;

import model.interfaces.IRound;

import java.util.ArrayList;

/**
 * Represent a question.
 *
 * @author
 * @version 1.0.0 2022-04-22.
 * @since 1.0.0 2022-04-22.
 */

public class Round implements IRound {
    private ArrayList<Option> options;
    private Question question;
    private Integer category;


    @Override
    public boolean checkOption(Option option) {
        return option.isCorrect();
    }

    @Override
    public String getRandomQuestion() {
        return null;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void addOptions(Option option) {
        options.add(option);
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(String question) {

        this.question = new Question(question);;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }
}
