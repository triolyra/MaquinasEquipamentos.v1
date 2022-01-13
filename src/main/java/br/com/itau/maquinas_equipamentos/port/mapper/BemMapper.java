package br.com.itau.maquinas_equipamentos.port.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.BemEntity;
import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.BemMaquEntityPK;
import br.com.itau.maquinas_equipamentos.domain.model.Bem;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;

@Mapper
public interface BemMapper {

	BemDto toDto(Bem bem);
	
	BemMaquEntityPK toEntityPk(String idBem, int idTipoBem);
	
	@Mapping(target= "pk.idBem", source = "idBem")
	@Mapping(target= "pk.idTipoBem", source = "idTipoBem")
	BemEntity toEntity(Bem bem);
	
	default Bem fromDto(BemDto bemDto) {
		return new Bem(
				bemDto.getIdBem(),
				bemDto.getIdTipoBem(),
				bemDto.getIdUsuarioResponsavel(),
				bemDto.getDataDoCadastro(),
				bemDto.getDataDaAlteracao(),
				bemDto.getIndicadorValorizacaoManual(),
				bemDto.getValorAtualDoBem());
	}
	
	default Bem fromEntity(BemEntity bemEntity) {
		return new Bem(
			bemEntity.getPk().getIdBem(),
			bemEntity.getPk().getIdTipoBem(),
			bemEntity.getIdUsuarioResponsavel(),
			bemEntity.getDataDoCadastro(),
			bemEntity.getDataDaAlteracao(),
			bemEntity.getIndicadorValorizacaoManual(),
			bemEntity.getValorAtualDoBem());
}
}
