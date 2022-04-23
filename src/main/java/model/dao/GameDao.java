package model.dao;


import controller.Game;

import java.util.List;

/**
 *Represent tge game dao, allowing to interact with the database
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class GameDao {
    public GameDao(){}

    public List<String> getGamesInfo(){
        return [];
    }

    private Integer getPlayerIdByPlayerName(String playerName){
      return 0;
    }

    public Boolean saveGameAndPlayer(Game game, Integer finalRound){
        return false;
    }

    private void saveGame(Integer playerId,Integer finalRound){

    }

}
