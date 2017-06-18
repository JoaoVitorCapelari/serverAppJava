package br.com.lenovo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.lenovo.modelo.Server;

public class ServerDao {

	private EntityManager manager;
	
	public ServerDao(EntityManager manager){
		this.manager = manager;
	}
	
	public Server busca(Integer id) {
		return this.manager.find(Server.class, id);
		}
		
	public List<Server> lista() {
		return this.manager.createQuery("select s from Server s",
		Server.class).getResultList();
		}
	
	public void adiciona(Server server) {
		this.manager.persist(server);
		}
		
	public void remove(Server server) {
		this.manager.remove(server);
		}
	
}
