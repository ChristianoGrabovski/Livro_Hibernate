package teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import jpa.JPAUtil;
import jpa.model.Livro;

public class ConsultarLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManager em = JPAUtil.getEntityManager();

		String sql = "Select * from Livro where preco < :valorPreco";
		Query sqlQuery = em.createNativeQuery(sql, Livro.class);

		sqlQuery.setParameter("valorPreco", 100);

		List<Livro> livro = sqlQuery.getResultList();

		for (Livro lv1 : livro)
			System.out.println(lv1.getNome());

	}

}
