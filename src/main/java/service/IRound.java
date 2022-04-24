package service;

import model.Option;

/**
 *Represent game's round
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public interface IRound {


    /**
     *Init a new round of the category.
     */
    void initRound(Integer category);

    /**
     *check if it is the last round.
     */
    Boolean isLastRound(Integer category);

    /**
     * check the answer.
     */
    void checkAnswer(Round round, Option optionSelected);

}
