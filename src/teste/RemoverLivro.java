package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jpa.JPAUtil;
import jpa.model.Livro;

public class RemoverLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		Livro livro = new Livro();
		livro.setId((long)5);		
		
		tx.begin();
		em.remove(em.merge(livro)); 
		tx.commit(); 
		em.close(); 
	

	}

}
