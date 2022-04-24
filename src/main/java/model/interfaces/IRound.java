package model.interfaces;

import model.Option;
import model.Player;
import model.Question;

import java.util.ArrayList;

public interface IRound {



    boolean checkOption(Option option);

    ArrayList<Option> getOptions();
    void addOptions(Option option);

    String getRandomQuestion();

    Question getQuestion();

    void setQuestion(Question question);

    Integer getCategory();

    void setCategory(Integer category);

    void increaseCategory();


    Player getPlayer();

    void setPlayer(Player player);

}
