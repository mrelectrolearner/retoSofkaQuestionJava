package service;

import model.Player;
import model.Round;
import view.CurrentGame;

import javax.swing.*;
import java.sql.SQLException;
import java.util.*;

/**
 *Represent the menu service use in the program to interact with the user.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class Menu {
    public Menu () {

    }


    public static void executeAction(char opcSelected) {
        switch(opcSelected){
            case '1':
                buildNewGame();
                break;
            case '2':
                showGamesHistorical();
                break;
            default:
                break;
        }
    }


    private static void buildNewGame() {
        Player currentPlayer = new Player();
        currentPlayer.setName(inputPlayerName());
        CurrentGame.playCurrentGame(currentPlayer);
    }

    private static void showGamesHistorical(){
        Record record = new Record();
        record.displayRecords();
    }


    private static String inputPlayerName() {
        String name = "";
        do {
            name = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador");
        } while(name.length() < 3);
        return name;
    }

    public static char mainMenu() {
        char opcSelected = ' ';
        do {
            opcSelected = JOptionPane.showInputDialog(null,
                    "*********MENU OPCIONES*********" + "\n" +
                            "1. Nuevo juego" + "\n" +
                            "2. Ver Historiales de Juegos" + "\n" +
                            "3. Salir").charAt(0);
        } while(opcSelected < '1' || opcSelected > '3');

        return opcSelected;
    }
}
