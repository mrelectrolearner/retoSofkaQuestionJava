package view;
import model.Option;
import model.Player;
import model.Question;
import model.Round;
import service.GameService;
import service.RoundService;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

public class CurrentGame {

    public static void playCurrentGame(Player player)  {
        GameService gameService = new GameService();
        RoundService roundService = new RoundService();
        Round round = gameService.initGame(player);

        while (!roundService.isLastRound(round.getCategory())) {

            Question question = round.getQuestion();
            Option optionA = round.getOptions().get(0);
            Option optionB = round.getOptions().get(1);
            Option optionC = round.getOptions().get(2);
            Option optionD = round.getOptions().get(3);
            char opcSelected = ' ';

            do {
                opcSelected = JOptionPane.showInputDialog(null, question.getInfo() + "\n" +
                        "A. " + optionA.getInfo() + "\n" +
                        "B. " + optionB.getInfo() + "\n" +
                        "C. " + optionC.getInfo() + "\n" +
                        "D. " + optionD.getInfo() + "\n" +
                        "E. Abandonar juego.").charAt(0);
            } while(opcSelected < 'A' || opcSelected > 'E');
            boolean isCorrect = false;
            switch (opcSelected){
                case 'A':
                    isCorrect = optionA.isCorrect();
                    break;
                case 'B':
                    isCorrect = optionB.isCorrect();
                    break;
                case 'C':
                    isCorrect = optionC.isCorrect();
                    break;
                case 'D':
                    isCorrect = optionD.isCorrect();
                    break;
            }
            if (opcSelected == 'E') {
                gameService.leaveGame(round);
                JOptionPane.showMessageDialog(null, "Señor jugador, usted ha finalizado el juego manualmente con: " + player.getScore() +" puntos.");
                break;
            }
            if(isCorrect) {
                player.setScore(player.getScore() + round.getCategory() * 100);
                if(roundService.isLastRound(round.getCategory()+1)) {
                    gameService.leaveGame(round);
                    JOptionPane.showMessageDialog(null, "Señor jugador, usted ha ganado el juego con un puntaje de: " + player.getScore() +" puntos.");
                    break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Señor jugador, usted ha respondido incorrectamente, el juego ha finalizado");
                break;
            }
            round = gameService.nextRound(round);
        }
    }
}
