package com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.model.Veiculo;



public class VeiculoDAO {
	EntityManagerFactory emf;
	EntityManager em;
	
	public VeiculoDAO() {
		emf = Persistence.createEntityManagerFactory("mysqlarantes");
		em = emf.createEntityManager();
		
	}
	
	public void salvar(Veiculo veiculo) {
		em.getTransaction().begin();
		em.merge(veiculo);
		em.getTransaction().commit();
		emf.close();
	
	}
	
	public void excluir(Veiculo veiculo) {
		em.getTransaction().begin();
		em.remove(veiculo);
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Veiculo> listarTodos(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("select veiculo from Veiculo veiculo");
		List<Veiculo> veiculos = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return veiculos;
	}

}
