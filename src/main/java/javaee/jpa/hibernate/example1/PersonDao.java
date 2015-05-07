package javaee.jpa.hibernate.example1;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersonDao {
	public Person findPersonById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaee.jpa.hibernate.example1.Person");
        EntityManager em = emf.createEntityManager();

        String q = "SELECT c FROM Person AS c WHERE c.id = ?1";
        Query query = (Query) em.createQuery(q);
        query.setParameter(1, new Long(id));
        List<?> l =  query.getResultList();
       	return (Person)l.get(0);
	}
}