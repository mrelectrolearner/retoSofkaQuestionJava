package service;

import model.Option;

/**
 * Represent
 *
 * @author
 * @version 1.0.0 2022-04-22.
 * @since 1.0.0 2022-04-22.
 */
public class Round implements IRound {
    public Integer category;

    @Override
    public void initRound(Integer category) {

    }

    @Override
    public Boolean isLastRound(Integer category) {
        return null;
    }

    @Override
    public void checkAnswer(Round round, Option optionSelected) {

    }
}
