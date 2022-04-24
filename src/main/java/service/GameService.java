package service;

import model.Option;
import model.Player;
import model.Round;

import java.sql.SQLException;

public class GameService implements  IGameService{

    RoundService roundService;

    public GameService() {
        this.roundService = new RoundService();
    }

    /**
     * @param round
     */
    @Override
    public void leaveGame(Round round) throws SQLException {
        Record record = new Record();
        record.saveRecord(round.getPlayer());
    }

    /**
     * @param round
     */
    /*@Override
    public void endGame(Round round) {

    }
        round=null;
    }*/

    /**
     * @return
     */
    @Override
    public Round initGame() {
        Player player=new Player();

        Round round =roundService.initRound(0,player);
        
        return round;

    }

    /**
     * @param round 
     * @return
     */
    @Override
    public Round nextRound(Round round, Option optionSelected) {
        if(roundService.isLastRound(round.getCategory())){
            System.out.println("Felicitaciones ha ganado el juego");
            return null;

        }

        //endGame();

        // return null;
        Round newRound=roundService.initRound(round.getCategory(),round.getPlayer());
        return newRound;
    }
}
