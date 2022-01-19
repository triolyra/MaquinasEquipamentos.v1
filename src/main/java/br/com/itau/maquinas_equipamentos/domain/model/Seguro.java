package br.com.itau.maquinas_equipamentos.domain.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Seguro {

	public Seguro(String idBem, int idTipoBem, LocalDate dataFimApolice, LocalDate dataInicioApolice,
			LocalDate dataRenovacaoApolice, char indicadorBeneficiarioSeguradora, String nomeSeguradora,
			double numeroApoliceSeguro, double numeroCpfOuCnpjSeguradora) {
			
		this.idBem = idBem;
		this.idTipoBem = idTipoBem;
		this.dataFimApolice = dataFimApolice;
		this.dataInicioApolice = dataInicioApolice;	
		this.dataRenovacaoApolice = dataRenovacaoApolice;
		this.indicadorBeneficiarioSeguradora =indicadorBeneficiarioSeguradora;
		this.nomeSeguradora = nomeSeguradora;
		this.numeroApoliceSeguro = numeroApoliceSeguro;
		this.numeroCpfOuCnpjSeguradora =numeroCpfOuCnpjSeguradora;
	}
	
	private String idBem; // pk (chave estrangeira que extende de bem)
	private int idTipoBem; // pk, fk

	private String nomeSeguradora;
	private double numeroCpfOuCnpjSeguradora;
	private double numeroApoliceSeguro;
	private char indicadorBeneficiarioSeguradora;
	private LocalDate dataInicioApolice;
	private LocalDate dataFimApolice;
	private LocalDate dataRenovacaoApolice;
	
}
