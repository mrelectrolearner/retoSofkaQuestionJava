package service;

import model.Option;
import model.Player;
import model.Round;

import java.sql.SQLException;

/**
 *Represent service provided to implement the game: leave the game, init the game and play the next round.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
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
