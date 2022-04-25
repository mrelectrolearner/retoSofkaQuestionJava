package service;

import model.Player;
import model.Round;
import view.CurrentGame;

import javax.swing.*;
import java.sql.SQLException;
import java.util.*;

public class Menu {
    public Menu () { }
    public static void executeAction(char opcSelected) {
        switch(opcSelected){
            case '1':
                buildNewGame();
                break;
            case '2':
                //inputNewQuestion();
                break;
            case '3':
                showGamesHistorical();
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
                            "2. Ingresar una nueva pregunta" + "\n" +
                            "3. Ver historiales de juegos" + "\n" +
                            "4. Salir").charAt(0);
        } while(opcSelected < '1' || opcSelected > '4');

        return opcSelected;
    }
}
