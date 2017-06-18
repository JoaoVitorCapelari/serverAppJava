package br.com.lenovo.teste;

import javax.persistence.EntityManager;

import br.com.lenovo.dao.ManutencaoDao;
import br.com.lenovo.modelo.Manutencao;
import br.com.lenovo.util.JPAUtil;

public class TestaBuscaServerDaManutencao {
	
	public static void main(String[] args) {
		
		EntityManager manager = new JPAUtil().getEntityManager();
		ManutencaoDao dao = new ManutencaoDao(manager);
		
		Manutencao manutencao = dao.busca(1);
		
		System.out.println("Modelo: "+manutencao.getServer().getModel());
	}
}
