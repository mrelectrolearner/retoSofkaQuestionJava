package service;

import model.Option;
import model.Round;

import java.sql.SQLException;

public interface IGameService {

    void leaveGame(Round round) throws SQLException;

    // void endGame(Round round);

    Round initGame();
    Round nextRound(Round round, Option optionSelected);
}
