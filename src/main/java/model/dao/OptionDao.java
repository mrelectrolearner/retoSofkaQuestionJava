package model.dao;

import model.Option;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *Represent the option Dao, allowing to interact with the database
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class OptionDao extends ConnectionDB{
    public OptionDao(){}

    /*public Option[] getOptionsByQuestionId(Integer questionId){
        return [];
    }*/

    public Boolean getOptionsByQuestionId(ArrayList<Option> options, Integer idQuestion){

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConnection();
        String query = "SELECT * FROM answer_option WHERE answer_option.id_question=? ";
        try {
            ps = con.prepareStatement(query);
            ps.setInt(1, idQuestion);
            rs = ps.executeQuery();
            while (rs.next()) {
                Option option=new Option("");
                option.setInfo (rs.getString("answer"));
                option.setId(rs.getInt("id_answer_option"));
                option.setCorrect(rs.getBoolean("is_correct"));
                options.add(option);

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

    private Boolean convertBoolean(String value) {
        return value.equals("1");
    }

}




