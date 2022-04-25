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
    public void leaveGame(Round round) {
        try {
            Record record = new Record();
            record.saveRecord(round.getPlayer());
        }
        catch (SQLException exception){
            System.out.println(exception);
        }
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
    public Round initGame(Player player) {

        Round round =roundService.initRound(1,player);
        
        return round;

    }

    /**
     * @param round 
     * @return
     */
    @Override
    public Round nextRound(Round round) {
        Round newRound=roundService.initRound(round.getCategory()+1,round.getPlayer());
        return newRound;
    }
}
