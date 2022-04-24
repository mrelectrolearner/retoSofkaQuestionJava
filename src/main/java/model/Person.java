package model;
/**
 *Represent a person.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public abstract class  Person {
    protected Integer id;
    protected String name;


    public abstract void setName(String name);


    @Override
    public String toString() {
        return "id: "+ this.id+"\n"+"nombre: "+this.name;
    }

    public abstract Integer getId();
}
