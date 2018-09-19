package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jpa.JPAUtil;
import jpa.model.Livro;

public class UpdateLivro {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		Livro livro = em.find(Livro.class, 1l);
		livro.setGenero("Fantasia e Humor");
		tx.commit();
		em.close();
		

	}

}
