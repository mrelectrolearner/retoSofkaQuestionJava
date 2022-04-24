import model.Player;
import model.dao.PlayerDao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PlayerDao playerDao = new PlayerDao();
        ArrayList<Player> players = playerDao.getPlayersInfo();
        players.forEach(p -> System.out.println(p.getScore()));
    }
}
