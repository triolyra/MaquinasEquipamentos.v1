package br.com.itau.maquinas_equipamentos.adapter.datastore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "TBGG076_BEM_MAQU")
@PrimaryKeyJoinColumn(name = "idBem")
public class MaquEquiEntity extends BemEntity{

	private static final long serialVersionUID = 8520639881951079985L;

	@Column(name = "COD_TIPO_MAQU_EQUI", nullable = false)
	private String idTipoMaquEqui;
	
	//private int finalidadeDeUso;
	
	@Column(name = "NUM_IDEF_MAQU_EQUI", nullable = false)
	private int numeroSequencial;
	
	@Column(name = "COD_NUM_SRIE_MAQU_EQUI", nullable = false)
	private String numeroDeSerie;
	
	@Column(name = "NUM_NOTA_FISC_MAQU_EQUI", nullable = false)
	private double numeroNotaFiscal;
	//private String dataNotaFiscal;
	
	@Column(name = "DESC_CMPL_MAQU_EQUI", nullable = false)
	private String descricaoCompl;

}
