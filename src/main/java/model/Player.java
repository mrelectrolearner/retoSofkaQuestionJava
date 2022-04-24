package model;

import model.interfaces.IPlayer;

/**
 *Represent a player.
 * @version 1.0.0 2022-04-22.
 * @author
 * @since 1.0.0 2022-04-22.
 */
public class Player extends  Person implements IPlayer {
    private Integer score;


    public Player(){}


    @Override
    public void setName(String name) {
        this.name=name;

    }


    public Integer getId() {
        return id;

    }
    public void setId(Integer id) {
        this.id= this.id;

    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
