package br.com.itau.maquinas_equipamentos.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Pessoa {

	private String idBem; // pk supostamente em outra entidade
	//private int idTipoBem; //pk, fk
	
	private String idContratoPessoa; //pk, fk
	private char idTipoPessoa;
	private int idTipoRelacionamentoGarantiaPessoa; //sempre vai ser 10, terceiro garantidor
	
	private double cpfOuCnpj;
	private String nome;
	private String email;
	private int dddTelefone;
	private double telefone;
}
