package db;

import javax.persistence.*;

@MappedSuperclass  // specifica JPA-ului ca aceasta clasa va fi mostenita de entitati dar ea nu este o entitate.
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Angajat {


    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    private String nume;

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

}
