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
            } while(opcSelected != '3');
    }
}
