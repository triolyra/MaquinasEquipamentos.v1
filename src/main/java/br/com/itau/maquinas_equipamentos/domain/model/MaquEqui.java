package br.com.itau.maquinas_equipamentos.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MaquEqui {

	public MaquEqui(String idBem, int idTipoBem, String idTipoMaquEqui, String numeroDeSerie,
			double numeroNotaFiscal, String descricaoCompl) {
		this.idBem = idBem;
		this.idTipoBem = idTipoBem;
		this.idTipoMaquEqui = idTipoMaquEqui;
		this.numeroDeSerie = numeroDeSerie;
		this.numeroNotaFiscal = numeroNotaFiscal;
		this.descricaoCompl = descricaoCompl;
	}

	// private String idGarantia; //fk - vem da api de garantia
	private String idBem; // pk (chave estrangeira que extende de bem)
	private int idTipoBem; // fk - vem da tabela de bem, tipo 7
	private String idTipoMaquEqui; // fk - vem da tabela de tipo de máquina e equipamento

	// bem, tipoBem e tipoMaqu seria um id composto?

	// private int finalidadeDeUso; //não sabemos se vai ser um atributo dessa
	// tabela
	// private int numeroSequencial; //não sabemos ainda o que é
	private String numeroDeSerie;
	private double numeroNotaFiscal;
	// private String dataNotaFiscal; //ainda não tem dentro do db
	private String descricaoCompl;

}
