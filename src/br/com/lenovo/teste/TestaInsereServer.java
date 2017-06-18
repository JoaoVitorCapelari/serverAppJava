package br.com.lenovo.teste;

import javax.persistence.EntityManager;

import br.com.lenovo.dao.ServerDao;
import br.com.lenovo.modelo.Server;
import br.com.lenovo.util.JPAUtil;

public class TestaInsereServer {
	
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
				
		ServerDao dao = new ServerDao(manager);
		
		Server server = new Server();
		
		server.setHd("Samsung4x3w10TB");
		server.setMemory("64GB");
		server.setModel("LenovoXPTO2015");
		server.setName("Firebird432");
		server.setPowerStatus("ON");
		server.setProcessor("Inteli7 7.8ghz");
		server.setTemperature("43°C");
		server.setSerialNumber("53423742759845634");
		
		
		manager.getTransaction().begin();
		dao.adiciona(server);
		manager.getTransaction().commit();
		manager.close();
				
		System.out.println("Novo servidor criado com sucesso");
		
	}
}
