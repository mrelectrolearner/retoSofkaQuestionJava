package service;

import model.Option;
import model.Round;

public interface IGameService {

    void leaveGame(Round round);

    void endGame(Round round);

    Round initGame();


    Round nextRound(Round round, Option optionSelected);
}
