package model;

/**
 * Represent a player.
 *
 * @author
 * @version 1.0.0 2022-04-22.
 * @since 1.0.0 2022-04-22.
 */
public class Player extends Person {
    private Integer score;


    public Player() {
        this.score = 0;
    }


    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getId() {
        return id;

    }

    @Override
    public void setId(Integer id) {
        this.id = this.id;

    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
