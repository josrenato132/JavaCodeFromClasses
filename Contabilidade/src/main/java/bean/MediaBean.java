package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

@ManagedBean
@ViewScoped
public class MediaBean {
 
	private String nome;
	private Double n1;
	private Double n2;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getN1() {
		return n1;
	}
	public void setN1(Double n1) {
		this.n1 = n1;
	}
	
	public Double getN2() {
		return n2;
	}
	public void setN2(Double n2) {
		this.n2 = n2;
	}
	
	public void calcular() {
		double mf = (n1 + n2) / 2;
		Messages.addGlobalInfo("Boa noite " + nome +"! A sua média é " + mf);
	}
}
