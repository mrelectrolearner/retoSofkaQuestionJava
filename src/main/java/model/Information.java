package model;
/**
 *Represent information about the question use in the program.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public abstract class Information {
    protected String text;

    public abstract void showInfo();
    public abstract String getInfo();
}
