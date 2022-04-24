package service;

import model.Player;
import model.dao.PlayerDao;

import java.util.ArrayList;

public class Record implements IRecord {
    @Override
    public void saveRecord(Player player) {

    }

    @Override
    public void displayRecords() {
        PlayerDao playerDao = new PlayerDao();

        ArrayList<Player> players = playerDao.getPlayersInfo();
        if (players) {
            players.forEach(p -> System.out.println("Player: " + p.setName() + "Score: " + p.getScore()));
        }
    }
}
