import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import model.*;
import service.GameService;
import service.QuestionService;
import service.Record;
import  service.Menu;
import model.dao.OptionDao;
import model.dao.PlayerDao;
import model.Question;
import model.dao.OptionDao;
import model.dao.QuestionDao;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

            char opcSelected ;
            do {
                opcSelected = Menu.mainMenu();
                Menu.executeAction(opcSelected);
            } while(opcSelected != '4');

        /*QuestionDao questionDao = new QuestionDao();
        QuestionDao questionDao = new QuestionDao();
        OptionDao optionDao=new OptionDao();

        Question question=new Question("");
        ArrayList<Option> options=new ArrayList<>();
       questionDao.findQuestion(1,question);
       optionDao.getOptionsByQuestionId(options, question.getId());

       System.out.println(question.getInfo());
       options.forEach(option -> {System.out.println(option.getInfo());});*/
        /*Record record = new Record();
        record.displayRecords();
        Player player = new Player();
        player.setName("MateoII");
        player.setScore(1000);
        record.saveRecord(player);*/

        /*questionDao.findQuestionByCategory(2,question);
       optionDao.getOptionsByQuestionId(options, question.getId());

       System.out.println(question.getInfo());
       options.forEach(option -> {System.out.println(option.getInfo());});*/

        /*QuestionService questionService = new QuestionService();
        Question question = questionService.getRandomQuestion(1);
        ArrayList<Option> options = questionService.getOptionsByQuestion(question);
        options.forEach(System.out::println);*/

        /*Player player = new Player();
        player.setName("Pepe");
        player.setScore(1500);
        Round round = new Round();
        round.setPlayer(player);
        GameService gameService = new GameService();
        gameService.leaveGame(round);*/

    }
}
