package model.dao;

import model.Question;
import model.Round;

import java.sql.*;

/**
 * Represent the question Dao, allowing to interact with the database
 *
 * @author
 * @version 1.0.0 2022-04-22.
 * @since 1.0.0 2022-04-22.
 */
public class QuestionDao extends ConnectionDB {
    private OptionDao optionDao = new OptionDao();

    public QuestionDao() {
    }

    public Boolean saveQuestion(Round round) {
        return false;
    }

    public boolean findQuestionByCategory(Integer category, Question question) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String query = "SELECT * FROM question WHERE question.category=? ORDER BY RAND() LIMIT 1";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, category);
            rs = ps.executeQuery();
            if (rs.next()) {
                question.setInformation(rs.getString("question"));
                question.setId(rs.getInt("id_question"));


            }
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);

            }
        }
    }

    public boolean findQuestion(Integer category, Question question) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String query = "SELECT * FROM question WHERE question.category=? ORDER BY RAND() LIMIT 1";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, category);
            rs = ps.executeQuery();
            if (rs.next()) {
                question.setInformation(rs.getString("question"));
                question.setId(rs.getInt("id_question"));


            }
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();

            } catch (SQLException e) {
                System.err.println(e);

            }
        }

    }


}
