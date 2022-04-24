import model.Option;
import model.Player;
import model.Question;
import service.Record;
import model.dao.OptionDao;
import model.dao.PlayerDao;
import model.Question;
import model.dao.OptionDao;
import model.dao.QuestionDao;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*QuestionDao questionDao = new QuestionDao();
        QuestionDao questionDao = new QuestionDao();
        OptionDao optionDao=new OptionDao();

        Question question=new Question("");
        ArrayList<Option> options=new ArrayList<>();
       questionDao.findQuestion(1,question);
       optionDao.getOptionsByQuestionId(options, question.getId());

       System.out.println(question.getInfo());
       options.forEach(option -> {System.out.println(option.getInfo());});*/
        Record record = new Record();
        //record.displayRecords();
        Player player = new Player();
        player.setName("MateoII");
        player.setScore(1000);
        record.saveRecord(player);


        /*questionDao.findQuestionByCategory(2,question);
       optionDao.getOptionsByQuestionId(options, question.getId());

       System.out.println(question.getInfo());
       options.forEach(option -> {System.out.println(option.getInfo());});*/
    }
}
