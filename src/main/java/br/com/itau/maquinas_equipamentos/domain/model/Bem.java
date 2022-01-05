package br.com.itau.maquinas_equipamentos.domain.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Bem {

	private int idTipoBem = 7; //fk - vem de outra tabela só de tipo de bem
	private String idBem; // pk

	private LocalDate dataDoCadastro;
	private LocalDate dataDaAlteracao;
	private String idUsuarioResponsavel;
	private char indicadorValorizacaoManual = 'S';
	private double valorAtualDoBem;
	
}
