package model;
/**
 *Represent information about the question or answer options use in the program.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class Information {
    public  Integer id;
    protected String info;

    public Information(String info) {
        this.info = info;
    }

    public String getInfo(){
        return this.info;
    };
    public void setInfo(String text){
        this.info = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
