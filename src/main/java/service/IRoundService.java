package service;

import model.Option;
import model.Player;
import model.Round;

/**
 *Represent game's round
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public interface IRoundService {


    /**
     * Init a new round of the category.
     *
     * @return
     */
    Round initRound(Integer category, Player player);

    /**
     *check if it is the last round.
     */
    Boolean isLastRound(Integer category);

    /**
     * check the answer selected.
     *
     * @return
     */
    boolean checkAnswer(Option optionSelected);

}
