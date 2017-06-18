package br.com.lenovo.teste;

import javax.persistence.EntityManager;

import br.com.lenovo.modelo.Server;
import br.com.lenovo.util.JPAUtil;

public class TestaPesquisaIdServer {
	
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		
		Server server = manager.find(Server.class, 1);
		
		System.out.println(server.getModel());
		
		manager.close();
	}
	
}
