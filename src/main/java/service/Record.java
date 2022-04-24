package service;

import model.Player;
import model.dao.PlayerDao;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Record implements IRecord {
    @Override
    public void saveRecord(Player player) {
        PlayerDao playerDao = new PlayerDao();
        System.out.println("En desarrollo...");
    }

    @Override
    public void displayRecords() {
        PlayerDao playerDao = new PlayerDao();
        ArrayList<Player> players = playerDao.getPlayersInfo();
        StringBuilder sb = new StringBuilder();
        if (players != null) {
            players.forEach(p -> sb.append("Player: " + "Score: " + p.getScore() + "\n"));
        }
        JOptionPane.showMessageDialog(null, sb);
    }
}
