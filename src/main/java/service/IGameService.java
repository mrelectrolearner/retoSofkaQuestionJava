package service;

import model.Option;
import model.Player;
import model.Round;

public interface IGameService {

    void leaveGame(Round round);

    void endGame(Round round);

    Round initGame(Player player);

    Round nextRound(Round round);

    Round nextRound(Round round, Option optionSelected);
}
