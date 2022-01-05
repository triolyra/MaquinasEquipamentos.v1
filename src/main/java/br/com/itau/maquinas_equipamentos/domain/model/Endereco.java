package br.com.itau.maquinas_equipamentos.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Endereco {

	private String idBem; // pk
	private int idTipoBem; //pk, fk
	
	private String cep;
	private String logradouro;
	private String complemento;
	
}
