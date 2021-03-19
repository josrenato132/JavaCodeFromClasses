package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import domain.Venda;
import util.JPAUtil;

public class VendaDAO {

	public void salvar(Venda venda) {
		EntityManager sessao = JPAUtil.getEntityManager();
		EntityTransaction transacao = sessao.getTransaction();
		transacao.begin();
		sessao.persist(venda);
		transacao.commit();
		sessao.close();
	}
	public Venda buscar(Integer codigo) {
		EntityManager sessao = JPAUtil.getEntityManager();
		Venda venda = sessao.find(Venda.class, codigo);
		return venda;
	}
}
