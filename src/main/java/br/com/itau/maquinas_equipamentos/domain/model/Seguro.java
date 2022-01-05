package br.com.itau.maquinas_equipamentos.domain.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Seguro {

	private String idBem; // pk
	private int idTipoBem; //pk, fk
	
	private String nomeSeguradora;
	private double numeroCpfOuCnpjSeguradora;
	private double numeroApoliceSeguro;
	private char indicadorBeneficiario;
	private LocalDate dataInicioApolice;
	private LocalDate dataFimApolice;
	private LocalDate dataRenovacaoApolice;
}
