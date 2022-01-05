package br.com.itau.maquinas_equipamentos.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MaquEqui {

	//private String idGarantia; //fk - vem da api de garantia
	private String idBem; // pk, fk - vem da tabela de bem
	private String idTipoBem; //fk - vem da tabela de bem, tipo 7
	private String idTipoMaquEqui; //fk - vem da tabela de tipo de máquina e equipamento
	
	//private int finalidadeDeUso; //não sabemos se vai ser um atributo dessa tabela
	//private int numeroIdentificador; //não sabemos ainda o que é
	private String numeroDeSerie;
	private double numeroNotaFiscal;
	//private String dataNotaFiscal; //ainda não tem dentro do db
	private String descricaoCompl;
}
