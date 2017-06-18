package br.com.lenovo.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.lenovo.dao.ServerDao;
import br.com.lenovo.modelo.Server;
import br.com.lenovo.util.JPAUtil;

public class TestaListagemServer {
	
	public static void main(String[] args) {
		EntityManager manager = new JPAUtil().getEntityManager();
		
		ServerDao dao = new ServerDao(manager);
		
		List<Server> lista = dao.lista();
		
		for (Server server : lista) {
			System.out.println(server.getSerialNumber());
		}
		
		manager.close();
	}
	
}
