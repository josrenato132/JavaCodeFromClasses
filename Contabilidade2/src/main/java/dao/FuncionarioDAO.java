package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import domain.Funcionario;
import util.JPAUtil;

public class FuncionarioDAO {

	public void salvar(Funcionario funcionario) {
		EntityManager sessao = JPAUtil.getEntityManager();
		EntityTransaction transacao = sessao.getTransaction();
		transacao.begin();
		sessao.persist(funcionario);
		transacao.commit();
		sessao.close();
	}
	public Funcionario buscar(Integer codigo) {
		EntityManager sessao = JPAUtil.getEntityManager();
		Funcionario funcionario = sessao.find(Funcionario.class, codigo);
		return funcionario;
	}
}
