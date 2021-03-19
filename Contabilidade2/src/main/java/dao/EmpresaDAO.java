package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import domain.Empresa;
import domain.Funcionario;
import util.JPAUtil;

public class EmpresaDAO {

	public void salvar(Empresa empresa) {
		EntityManager sessao = JPAUtil.getEntityManager();
		EntityTransaction transacao = sessao.getTransaction();
		transacao.begin();
		sessao.persist(empresa);
		transacao.commit();
		sessao.close();
	}
	public Empresa buscar(Integer codigo) {
		EntityManager sessao = JPAUtil.getEntityManager();
		Empresa empresa = sessao.find(Empresa.class, codigo);
		return empresa;
	}
	@SuppressWarnings("unchecked")
	public List<Empresa> listar() {
		String jpql ="select e from Empresa e order by nome";
		EntityManager sessao = JPAUtil.getEntityManager();
		Query consulta = sessao.createQuery(jpql);
		List<Empresa> resultado = consulta.getResultList();
		return resultado;
	}
}
