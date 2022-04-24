package model;

import java.util.ArrayList;

/**
 * Represent a question.
 *
 * @author
 * @version 1.0.0 2022-04-22.
 * @since 1.0.0 2022-04-22.
 */

public class Question extends Information {
    private ArrayList<Option> options;
    private String question;
    private Integer category;

    @Override
    public void showInfo() {

    }

    @Override
    public String getInfo() {
        return null;
    }
}
