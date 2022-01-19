package br.com.itau.maquinas_equipamentos.port.mapper;

import org.mapstruct.Mapper;

import org.mapstruct.Mapping;

import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.BemEntity;
<<<<<<< Updated upstream
import br.com.itau.maquinas_equipamentos.domain.model.Bem;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import org.springframework.stereotype.Component;
=======
import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.BemMaquEntityPK;
import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.EnderecoEntity;
import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.MaquEquiEntity;
import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.PessoaEntity;
import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.PessoaResponsavelEntityPK;
import br.com.itau.maquinas_equipamentos.adapter.datastore.entity.SeguroEntity;
import br.com.itau.maquinas_equipamentos.domain.model.Bem;
import br.com.itau.maquinas_equipamentos.domain.model.Endereco;
import br.com.itau.maquinas_equipamentos.domain.model.MaquEqui;
import br.com.itau.maquinas_equipamentos.domain.model.Pessoa;
import br.com.itau.maquinas_equipamentos.domain.model.Seguro;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import br.com.itau.maquinas_equipamentos.port.dto.EnderecoDto;
import br.com.itau.maquinas_equipamentos.port.dto.MaquEquiDto;
import br.com.itau.maquinas_equipamentos.port.dto.PessoaDto;
import br.com.itau.maquinas_equipamentos.port.dto.SeguroDto;
>>>>>>> Stashed changes

@Mapper
@Component
public interface BemMapper {

<<<<<<< Updated upstream
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
=======
	BemMaquEntityPK toEntityPk(String idBem, int idTipoBem);

	PessoaResponsavelEntityPK toPessoapk(String idBem, int idTipoBem, String idContratoPessoa);

	BemDto toBemDto(Bem bem);

	@Mapping(target = "pk.idBem", source = "idBem")
	@Mapping(target = "pk.idTipoBem", source = "idTipoBem")
	BemEntity toBemEntity(Bem bem);

	EnderecoDto toEnderecoDto(Endereco endereco);

	@Mapping(target = "pk.idBem", source = "idBem")
	@Mapping(target = "pk.idTipoBem", source = "idTipoBem")
	EnderecoEntity toEnderecoEntity(Endereco endereco);

	MaquEquiDto toMaquEquiDto(MaquEqui maquEqui);

	@Mapping(target = "pk.idBem", source = "idBem")
	@Mapping(target = "pk.idTipoBem", source = "idTipoBem")
	MaquEquiEntity toMaquEquiEntity(MaquEqui maquEqui);

	PessoaDto toPessoaDto(Pessoa pessoa);

	@Mapping(target = "pk.idBem", source = "idBem")
	@Mapping(target = "pk.idTipoBem", source = "idTipoBem")
	@Mapping(target = "pk.idContratoPessoa", source = "idContratoPessoa")
	PessoaEntity toPessoaEntity(Pessoa pessoa);

	SeguroDto toSeguroDto(Seguro seguro);

	@Mapping(target = "pk.idBem", source = "idBem")
	@Mapping(target = "pk.idTipoBem", source = "idTipoBem")
	SeguroEntity toSeguroEntity(Seguro seguro);

	default Bem fromBemDto(BemDto bemDto) {
		return new Bem(bemDto.getIdBem(), bemDto.getIdTipoBem(), bemDto.getIdUsuarioResponsavel(),
				bemDto.getDataDoCadastro(), bemDto.getDataDaAlteracao(), bemDto.getIndicadorValorizacaoManual(),
				bemDto.getValorAtualDoBem());
	}

	default Bem fromBemEntity(BemEntity bemEntity) {
		return new Bem(bemEntity.getPk().getIdBem(), bemEntity.getPk().getIdTipoBem(),
				bemEntity.getIdUsuarioResponsavel(), bemEntity.getDataDoCadastro(), bemEntity.getDataDaAlteracao(),
				bemEntity.getIndicadorValorizacaoManual(), bemEntity.getValorAtualDoBem());
	}

	default Endereco fromEnderecoDto(EnderecoDto enderecoDto) {
		return new Endereco(enderecoDto.getIdBem(), enderecoDto.getIdTipoBem(), enderecoDto.getCep(),
				enderecoDto.getLogradouro(), enderecoDto.getComplemento());
	}

	default Endereco fromEnderecoEntity(EnderecoEntity enderecoEntity) {
		return new Endereco(enderecoEntity.getPk().getIdBem(), enderecoEntity.getPk().getIdTipoBem(),
				enderecoEntity.getCep(), enderecoEntity.getLogradouro(), enderecoEntity.getComplemento());
	}

	default MaquEqui fromMaquEquiDto(MaquEquiDto maquEquiDto) {
		return new MaquEqui(maquEquiDto.getIdBem(), maquEquiDto.getIdTipoBem(), maquEquiDto.getIdTipoMaquEqui(),
				maquEquiDto.getNumeroDeSerie(), maquEquiDto.getNumeroNotaFiscal(), maquEquiDto.getDescricaoCompl());
	}

	default MaquEqui fromMaquEquiEntity(MaquEquiEntity maquEquiEntity) {
		return new MaquEqui(maquEquiEntity.getPk().getIdBem(), maquEquiEntity.getPk().getIdTipoBem(),
				maquEquiEntity.getIdTipoMaquEqui(), maquEquiEntity.getNumeroDeSerie(),
				maquEquiEntity.getNumeroNotaFiscal(), maquEquiEntity.getDescricaoCompl());

	}

	default Pessoa fromPessoaDto(PessoaDto pessoaDto) {
		return new Pessoa(pessoaDto.getIdContratoPessoa(), pessoaDto.getIdTipoRelacionamentoGarantiaPessoa(),
				pessoaDto.getCpfOuCnpj(), pessoaDto.getNome(), pessoaDto.getEmail(), pessoaDto.getDddTelefone(),
				pessoaDto.getTelefone());
	}

	default Pessoa fromPessoaEntity(PessoaEntity pessoaEntity) {
		return new Pessoa(pessoaEntity.getPk().getIdBem(), pessoaEntity.getPk().getIdTipoBem(),
				pessoaEntity.getIdTipoPessoaContrato(), pessoaEntity.getNome(), pessoaEntity.getEmail(),
				pessoaEntity.getDddTelefone(), pessoaEntity.getTelefone());

	}

	default Seguro fromSeguroDto(SeguroDto seguroDto) {
		return new Seguro(seguroDto.getDataFimApolice(), seguroDto.getDataInicioApolice(),
				seguroDto.getDataRenovacaoApolice(), seguroDto.getIndicadorBeneficiarioSeguradora(),
				seguroDto.getNomeSeguradora(), seguroDto.getNumeroApoliceSeguro(),
				seguroDto.getNumeroCpfOuCnpjSeguradora());

	}

	default Seguro fromSeguroEntity(SeguroEntity seguroEntity) {
		return new Seguro(seguroEntity.getPk().getIdBem(), seguroEntity.getPk().getIdTipoBem(),
				seguroEntity.getDataFimApolice(), seguroEntity.getDataInicioApolice(),
				seguroEntity.getDataRenovacaoApolice(), seguroEntity.getIndicadorBeneficiarioSeguradora(),
				seguroEntity.getNomeSeguradora(), seguroEntity.getNumeroApoliceSeguro(),
				seguroEntity.getNumeroCpfOuCnpjSeguradora());
>>>>>>> Stashed changes
	}
}