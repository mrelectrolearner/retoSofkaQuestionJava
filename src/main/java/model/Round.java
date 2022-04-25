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
    private Player player;
    private ArrayList<Option> options;
    private Question question;
    private Integer category;


    public Round() {
    }

    public Round(Player player, ArrayList<Option> options, Question question, Integer category) {
        this.player = player;
        this.options = options;
        this.question = question;
        this.category = category;
    }

    @Override
    public boolean checkOption(Option option) {
        return option.isCorrect();
    }

    @Override
    public String getRandomQuestion() {
        return null;
    }

    @Override
    public ArrayList<Option> getOptions() {
        return options;
    }

    @Override
    public void addOptions(Option option) {
        options.add(option);
    }

    @Override
    public Question getQuestion() {
        return question;
    }

    @Override
    public void setQuestion(Question question) {

        this.question = question;
    }

    @Override
    public Integer getCategory() {
        return category;
    }

    @Override
    public void setCategory(Integer category) {
        this.category = category;
    }

    /**
     *
     */
    @Override
    public void increaseCategory() {
        this.category++;

    }

    @Override
    public Player getPlayer() {
        return this.player;
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;
    }

}
