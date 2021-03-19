package domain;

import java.math.BigDecimal;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Venda {
	@Id
	@Column(nullable = false, unique = true)
	private Integer codigo;
	
	@Column(nullable = false, precision = 5, scale = 2)
	private BigDecimal valor;
	
	@Column
	private LocalTime hora;
	
	@Column(nullable = false)
	private Integer quantidade;
}
