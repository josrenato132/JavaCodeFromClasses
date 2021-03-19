package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Funcionario {
	@Id
	@Column(nullable = false, unique = true)
	private Integer codigo;
	@Column(length = 50, nullable = false)
	private String nome;
	@Column(length = 11, nullable = false, unique = true)
	private String cpf;
}
