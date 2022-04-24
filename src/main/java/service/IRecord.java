package service;

import model.Player;

import java.sql.SQLException;

public interface IRecord {

    void saveRecord(Player player) throws SQLException;

    void displayRecords();

}
