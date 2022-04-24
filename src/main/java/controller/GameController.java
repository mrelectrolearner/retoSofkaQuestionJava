package controller;

import model.Player;
import service.GameService;

public class GameController implements IGame{
    GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    /**
     *
     */
    @Override
    public void playGame() {
        Player player=new Player();
        gameService.initGame();


    }
}
