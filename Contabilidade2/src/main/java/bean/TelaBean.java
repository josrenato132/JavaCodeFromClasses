package bean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import dao.EmpresaDAO;
import domain.Empresa;
import lombok.Data;

@SuppressWarnings("serial")
@Named
@ViewScoped
@Data
public class TelaBean implements Serializable {
	private Empresa empresa = new Empresa();
	private EmpresaDAO empresaDAO = new EmpresaDAO();
	private List<Empresa> empresas;
	
	@PostConstruct
	public void iniciar() {
		empresaDAO = new EmpresaDAO();
		
		empresa = new Empresa();
		listar();
	}
	public void salvar() {
		empresaDAO.salvar(empresa);
		empresa = new Empresa();
		listar();
		Messages.addGlobalInfo("Registrado com sucesso!" + empresa);
	}
	public void listar() {
		empresas = empresaDAO.listar();
	}
}
