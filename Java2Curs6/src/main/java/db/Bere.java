package db;

import javax.persistence.Entity;


@Entity
public class Bere extends Produs{

    private int alcool;

    public int getAlcool() {
        return alcool;
    }

    public void setAlcool(int alcool) {
        this.alcool = alcool;
    }
}
