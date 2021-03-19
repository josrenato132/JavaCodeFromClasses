package dao;

import org.junit.Test;

import domain.Funcionario;

public class FuncionarioDAOTest {
	@Test
	public void salvar() {
		Funcionario f1 = new Funcionario();
		f1.setCodigo(1);
		f1.setCpf("11111111111");
		f1.setNome("Nome");
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(f1);
	}	
}
