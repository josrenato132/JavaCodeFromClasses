package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import domain.Usuario;
import util.JPAUtil;

public class UsuarioDAO {

	public void salvar(Usuario usuario) {
		EntityManager sessao = JPAUtil.getEntityManager();
		EntityTransaction transacao = sessao.getTransaction();
		transacao.begin();
		sessao.persist(usuario);
		transacao.commit();
		sessao.close();
	}
	public Usuario buscar(Integer codigo) {
		EntityManager sessao = JPAUtil.getEntityManager();
		Usuario usuario = sessao.find(Usuario.class, codigo);
		return usuario;
	}
}
