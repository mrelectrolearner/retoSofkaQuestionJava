package model;
/**
 *Represent information about the question use in the program.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class Information {
    protected String text;

    public Information(String text) {
        this.text = text;
    }

    public String getInfo(){
        return this.text;
    };
    public void setInfo(String text){
        this.text= text;
    }


}
