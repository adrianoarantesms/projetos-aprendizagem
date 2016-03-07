package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Contato;

public class ContatoDAO {
	EntityManagerFactory emf;
	EntityManager em;
	
	public ContatoDAO() {
		emf = Persistence.createEntityManagerFactory("mysqlarantes");
		em = emf.createEntityManager();
		
	}
	
	public void salvar(Contato contato) {
		em.getTransaction().begin();
		em.merge(contato);
		em.getTransaction().commit();
		emf.close();
	
	}
	
	public void excluir(Contato contato) {
		em.getTransaction().begin();
		em.remove(contato);
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Contato> listarTodos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select contato from Contato contato");
		List<Contato> contatos = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return contatos;
	}
	
	

}
