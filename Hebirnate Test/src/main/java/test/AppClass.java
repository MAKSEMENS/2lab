package test;

import javax.persistence.*;



public class AppClass {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("test_persistence");
        EntityManager em = emf.createEntityManager();

        System.out.println("ааааааааааааааааа");

        Movie gr = new Movie();
        gr.SetTitle("TestMovie");

        em.persist(gr);
        em.getTransaction().commit();

        System.out.println("New Movie Id is" + gr.GetMovieId());

    }
}
