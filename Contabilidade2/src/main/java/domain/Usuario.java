package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Usuario {
	
	@Id
	@Column(nullable = false, unique = true)
	private Integer codigo;
	@Column(length = 50, nullable = false, unique = true)
	private String login;
	@Column(length = 10, nullable = false)
	private String senha;
	@Column(length = 50, nullable = false, unique = true)
	private String email; 
}
