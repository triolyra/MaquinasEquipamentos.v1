package br.com.itau.maquinas_equipamentos.port.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.BemEntity;
import br.com.itau.maquinas_equipamentos.domain.model.Bem;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface BemMapper {

	BemDto toDto(Bem bem);

	@Mapping(target = "idBem", source = "idBem")
	BemEntity toEntity(Bem bem);

	default Bem fromDto(BemDto bemDto) {
		return new Bem(
				bemDto.getIdBem(),
				bemDto.getIdTipoBem(),
				bemDto.getDataDoCadastro(),
				bemDto.getDataDaAlteracao(),
				bemDto.getIdUsuarioResponsavel(),
				bemDto.getIndicadorValorizacaoManual(),
				bemDto.getValorAtualDoBem());
	}

	default Bem fromEntity(BemEntity bemEntity) {
		return new Bem(
				bemEntity.getIdBem(),
				bemEntity.getIdTipoBem(),
				bemEntity.getDataDoCadastro(),
				bemEntity.getDataDaAlteracao(),
				bemEntity.getIdUsuarioResponsavel(),
				bemEntity.getIndicadorValorizacaoManual(),
				bemEntity.getValorAtualDoBem());
	}
}