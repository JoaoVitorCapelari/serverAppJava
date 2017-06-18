package br.com.lenovo.teste;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;

import br.com.lenovo.dao.ManutencaoDao;
import br.com.lenovo.dao.ServerDao;
import br.com.lenovo.modelo.Manutencao;
import br.com.lenovo.modelo.Server;
import br.com.lenovo.util.JPAUtil;

public class TestaInsereManutencao {
	//insere manutenção associada a um server
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		ManutencaoDao manuntencaoDao = new ManutencaoDao(manager);
		ServerDao serverDao = new ServerDao(manager);
		
		manager.getTransaction().begin();
		
		Server server = new Server();
		server.setHd("HTC 4TB");
		server.setMemory("16GB");
		server.setModel("Lenovo65468");
		server.setName("Icecube");
		server.setPowerStatus("OFF");
		server.setProcessor("Core 2 Duo 4.5ghz");
		server.setSerialNumber("435346576756");
		server.setTemperature("55°C");

		Manutencao manutencao = new Manutencao();
		manutencao.setDescricao("muitos problemas, tivemos que desliga-lo");
		manutencao.setData(LocalDateTime.now());
		server.setName("Icecube");
		
		serverDao.adiciona(server);
		manuntencaoDao.adiciona(manutencao);
		manager.getTransaction().commit();
		manager.close();
	}
}
