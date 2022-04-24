import model.Option;
import model.Player;
import model.Question;
import model.dao.OptionDao;
import model.dao.PlayerDao;
import model.dao.QuestionDao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        QuestionDao questionDao = new QuestionDao();
        OptionDao optionDao=new OptionDao();

        Question question=new Question("");
        ArrayList<Option> options=new ArrayList<>();
       questionDao.findQuestion(1,question);
       optionDao.getOptionsByQuestionId(options, question.getId());

       System.out.println(question.getInfo());
       options.forEach(option -> {System.out.println(option.getInfo());});
    }
}
