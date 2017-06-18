package br.com.lenovo.teste;

import javax.persistence.EntityManager;

import br.com.lenovo.dao.ServerDao;
import br.com.lenovo.modelo.Server;
import br.com.lenovo.util.JPAUtil;

public class TestaAlteraServer {

	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		
		ServerDao dao = new ServerDao(manager);
		
		manager.getTransaction().begin();
		
		Server server = dao.busca(2);
		server.setModel("IBM65346");
		
		manager.getTransaction().commit();
		manager.close();
	}
}
