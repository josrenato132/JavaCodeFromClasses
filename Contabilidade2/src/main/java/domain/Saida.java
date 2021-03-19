package domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
public class Saida {
	@Id
	@Column(nullable = false, unique = true)
	private Integer codigo;
	
	@Column(nullable = false, precision = 5, scale = 2)
	private BigDecimal valorSaiu;
}
