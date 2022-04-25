package service;

import model.Option;
import model.Player;
import model.Question;
import model.Round;


import java.sql.SQLException;
import java.util.ArrayList;



/**
 *Represent
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class RoundService implements IRoundService {

    QuestionService questionService;

    public RoundService() {

        questionService=new QuestionService();
    }

    /**
     * @param category
     * @return
     */
    @Override
    public Round initRound(Integer category, Player player)  {
        try {
            Question question=questionService.getRandomQuestion(category);
            Thread.sleep(2000);
            ArrayList<Option> options=questionService.getOptionsByQuestion(question);
            Round round=new Round( player, options,question, category);

            return round;
        }
        catch (InterruptedException e) {
            System.out.println(e);
            return new Round();
        }

    }

    /**
     * @param category
     * @return
     */
    @Override
    public Boolean isLastRound(Integer category) {
        return category>5;
    }
}
