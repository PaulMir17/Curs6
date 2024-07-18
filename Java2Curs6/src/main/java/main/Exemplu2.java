package main;

import db.Avocat;
import db.Programator;

import javax.persistence.Persistence;

public class Exemplu2 {

    public static void main(String[] args) {


        var emf= Persistence.createEntityManagerFactory("java2c6PU");
                var em=emf.createEntityManager();


        Programator p= new Programator();

                p.setLimbaj("GO");
                p.setNume("gigel");

        Avocat a=new Avocat();

        a.setNume("ion");
        a.setVechime(20);

        em.getTransaction().begin();

        em.persist(p);
        em.persist(a);

        em.getTransaction().commit();

        em.close();
        emf.close();


    }
}
