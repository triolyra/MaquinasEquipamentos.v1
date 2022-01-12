package br.com.itau.maquinas_equipamentos.domain.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Bem {

	public Bem(String idBem, int idTipoBem, LocalDate dataDoCadastro, LocalDate dataDaAlteracao,
			String idUsuarioResponsavel, char indicadorValorizacaoManual, double valorAtualDoBem) {
	}
	
}
