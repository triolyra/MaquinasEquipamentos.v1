package br.com.itau.maquinas_equipamentos.adapter.datastore.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBGG070_BEM")
@Inheritance(strategy = InheritanceType.JOINED)
public class BemEntity implements Serializable {

	private static final long serialVersionUID = -8880530742404299050L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "COD_BEM", nullable = false)
	private String idBem;

	@Column(name = "COD_TIPO_BEM", nullable = false)
	private int idTipoBem;

	@Column(name = "DAT_HOR_CADT_RGTO", nullable = false)
	private LocalDate dataDoCadastro;

	@Column(name = "DAT_HOR_ALTE_RGTO", nullable = false)
	private LocalDate dataDaAlteracao;

	@Column(name = "COD_USUA_RSPL_ALTE", nullable = false)
	private String idUsuarioResponsavel;

	@Column(name = "IND_VLRZ_MANU", nullable = false)
	private char indicadorValorizacaoManual;

	@Column(name = "VLR_ATUL_BEM", nullable = false)
	private double valorAtualDoBem;
}