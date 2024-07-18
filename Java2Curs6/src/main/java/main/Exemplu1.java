package main;

import db.Bere;
import db.Ciocolata;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Exemplu1 {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("java2c6PU");
        EntityManager entityManager= entityManagerFactory.createEntityManager();

        Ciocolata c=new Ciocolata();

        c.setNume("milka");
        c.setZahar(20);

        Bere b=new Bere();

        b.setNume("timisoreana");
        b.setAlcool(5);

        entityManager.getTransaction().begin();

        entityManager.persist(b);
        entityManager.persist(c);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
