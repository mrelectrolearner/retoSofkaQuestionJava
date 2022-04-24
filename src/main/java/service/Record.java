package service;

import model.Player;
import model.dao.PlayerDao;

import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.ArrayList;

public class Record implements IRecord {
    @Override
    public void saveRecord(Player player) throws SQLException {
        PlayerDao playerDao = new PlayerDao();
        playerDao.sevePlayer(player);
    }

    @Override
    public void displayRecords() {
        PlayerDao playerDao = new PlayerDao();
        ArrayList<Player> players = playerDao.getPlayersInfo();
        StringBuilder sb = new StringBuilder();
        if (players != null) {
            players.forEach(p -> sb.append("Player: " + p.getName() + " - Score: " + p.getScore() + "\n"));
        }
        JOptionPane.showMessageDialog(null, sb);
    }
}
