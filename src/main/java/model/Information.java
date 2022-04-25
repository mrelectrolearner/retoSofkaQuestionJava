package model;
/**
 *Represent information about the question or answer options use in the program.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class Information {
    public  Integer id;
    protected String information;

    public Information(String info) {
        this.information = info;
    }

    public String getInformation(){
        return this.information;
    };
    public void setInformation(String text){
        this.information = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
