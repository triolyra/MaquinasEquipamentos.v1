package br.com.itau.maquinas_equipamentos.domain.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Bem {

	public Bem(String idBem, int idTipoBem, LocalDate dataDoCadastro, LocalDate dataDaAlteracao,
			String idUsuarioResponsavel, char indicadorValorizacaoManual, double valorAtualDoBem) {
	}
	private int idTipoBem; //fk - vem de outra tabela só de tipo de bem
	private String idBem; // pk
	
	//bem precisa ter um id composto???????

	private LocalDate dataDoCadastro;
	private LocalDate dataDaAlteracao;
	private String idUsuarioResponsavel;
	private char indicadorValorizacaoManual;
	private double valorAtualDoBem;
	
}
