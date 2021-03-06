package model.dao;

import model.Player;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Represent the player dao, allowing to interact with the database
 *
 * @author
 * @version 1.0.0 2022-04-22.
 * @since 1.0.0 2022-04-22.
 */
public class PlayerDao extends ConnectionDB {

    public PlayerDao() {
    }


    public ArrayList<Player> getPlayersInfo() {

        PreparedStatement ps = null;
        Connection con = getConnection();
        ResultSet rs = null;

        String query = "SELECT * FROM player";
        try {
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Player> winnersList = new ArrayList<>();
            while (rs.next()) {
                //add code to print in jTable
                Player winner = new Player();
                winner.setId((Integer) rs.getObject(1));
                winner.setName(String.valueOf(rs.getObject(2)));
                winner.setScore((Integer) rs.getObject(3));
                winnersList.add(winner);     //create the list of the winners
            }
            return winnersList;

        } catch (SQLException e) {
            System.err.println(e);
            return null;
        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }

    public void sevePlayer(Player player) throws SQLException {
        try {
            Connection con = getConnection();
            String query = "INSERT INTO player (player_name, points) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, player.getName());
            ps.setString(2, String.valueOf(player.getScore()));
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }


}
