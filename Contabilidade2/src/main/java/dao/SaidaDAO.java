package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import domain.Funcionario;
import domain.Saida;
import util.JPAUtil;

public class SaidaDAO {

	public void salvar(Saida saida) {
		EntityManager sessao = JPAUtil.getEntityManager();
		EntityTransaction transacao = sessao.getTransaction();
		transacao.begin();
		sessao.persist(saida);
		transacao.commit();
		sessao.close();
	}
	public Saida buscar(Integer codigo) {
		EntityManager sessao = JPAUtil.getEntityManager();
		Saida saida = sessao.find(Saida.class, codigo);
		return saida;
	}
}
