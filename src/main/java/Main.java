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
/**
 *Init the game and show the main menu to the users.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class Main {
    public static void main(String[] args) {

            char opcSelected ;
            do {
                opcSelected = Menu.mainMenu();
                Menu.executeAction(opcSelected);
            } while(opcSelected != '3');
    }
}
