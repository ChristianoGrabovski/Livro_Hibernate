package teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import jpa.JPAUtil;
import jpa.model.Livro;

public class AddLivro {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction(); 
		
		Livro livro = new Livro();
		livro.setNome("The Livro");
		livro.setGenero("fantasia");
		livro.setAutor("O Cara");
		livro.setPreco(10.99);
		
		tx.begin();
		em.persist(livro);
		tx.commit();
		em.close();

	}

}
