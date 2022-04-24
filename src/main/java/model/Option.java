package model;

import model.interfaces.IOption;

/**
 *Represent the question's options use in the program.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class Option extends Information implements IOption {

    private boolean isCorrect;

    public Option(String text) {
        super(text);
    }
    @Override
    public void setCorrect(boolean correct) {
        isCorrect = correct;
    }
    @Override
    public boolean isCorrect() {
        return this.isCorrect;
    }
}
