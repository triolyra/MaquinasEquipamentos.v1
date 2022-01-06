package br.com.itau.maquinas_equipamentos.domain.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Bem {

	private int idTipoBem = 7; //fk - vem de outra tabela só de tipo de bem
	private String idBem; // pk
	
	//bem precisa ter um id composto???????

	private LocalDate dataDoCadastro;
	private LocalDate dataDaAlteracao;
	private String idUsuarioResponsavel;
	private char indicadorValorizacaoManual = 'S';
	private double valorAtualDoBem;
	
}
