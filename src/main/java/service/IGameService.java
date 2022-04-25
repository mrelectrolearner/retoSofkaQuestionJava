package service;

import model.Option;
import model.Player;
import model.Round;

import java.sql.SQLException;

public interface IGameService {

    void leaveGame(Round round) throws SQLException;

    // void endGame(Round round);

    Round initGame(Player player);
    Round nextRound(Round round);
}
