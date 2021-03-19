package main;

import javax.persistence.EntityManager;

import util.JPAUtil;

public class TestaConexao {

	public static void main(String[] args) {
		/*
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("ContabilidadePU");
		
		EntityManager sessao = fabrica.createEntityManager();
		//System.out.println(sessao);
		
		sessao.close();
		fabrica.close();
	*/
		
		EntityManager sessao = JPAUtil.getEntityManager();
		sessao.close();
	}
}
