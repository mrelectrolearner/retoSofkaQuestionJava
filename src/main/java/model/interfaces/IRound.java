package model.interfaces;

import model.Option;
import model.Question;

import java.util.ArrayList;

public interface IRound {



    boolean checkOption(Option option);

    ArrayList<Option> getOptions();
    void addOptions(Option option);

    String getRandomQuestion();

    Question getQuestion();

    void setQuestion(String question);

    Integer getCategory();

    void setCategory(Integer category);

}
