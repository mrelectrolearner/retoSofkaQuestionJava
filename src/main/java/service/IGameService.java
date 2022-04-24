package service;

import model.Player;

public interface IGameService {

    void leaveGame(Round round, Player player);

    void endGame(Round round, Player player);

    void initGame(Round round, Player player);
}
