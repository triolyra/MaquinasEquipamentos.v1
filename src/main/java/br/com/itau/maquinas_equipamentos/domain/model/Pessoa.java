package br.com.itau.maquinas_equipamentos.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Pessoa {

	public Pessoa(String idBem, int idTipoBem,String idPessoaContrato, String idContratoPessoa, int idTipoRelacionamentoGarantiaPessoa,
			double cpfOuCnpj, String nome, String email, int dddTelefone, double telefone) {

		this.idBem = idBem;
		this.idTipoBem = idTipoBem;

		this.idPessoaContrato = idPessoaContrato;
		this.idContratoPessoa = idContratoPessoa;
		this.idTipoRelacionamentoGarantiaPessoa = idTipoRelacionamentoGarantiaPessoa;
		this.cpfOuCnpj = cpfOuCnpj;
		this.nome = nome;
		this.email = email;
		this.dddTelefone = dddTelefone;
		this.telefone = telefone;
	}

	private String idBem;
	private int idTipoBem;
	private String idPessoaContrato;
	private String idContratoPessoa; // pk
	private int idTipoRelacionamentoGarantiaPessoa; // sempre vai ser 10, terceiro garantidor
	private double cpfOuCnpj;
	private String nome;
	private String email;
	private int dddTelefone;
	private double telefone;
}
