package br.com.lenovo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.lenovo.modelo.Manutencao;

public class ManutencaoDao {

	private EntityManager manager;

	public ManutencaoDao(EntityManager manager) {
		this.manager = manager;
	}
	
	public void adiciona(Manutencao manutencao){
		manager.persist(manutencao);
	}
	
	public Manutencao busca(Integer id){
		return manager.find(Manutencao.class, id);
	}
	
	public void remove(Manutencao manutencao){
		manager.remove(manutencao);
	}
	
	public List<Manutencao> lista(){
		return manager.createQuery("select m from Manutencao m", Manutencao.class).getResultList();
	}
	
}
