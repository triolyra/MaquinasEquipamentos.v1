package br.com.itau.maquinas_equipamentos.adapter.datastore.repository.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.itau.maquinas_equipamentos.adapter.datastore.repository.MaquEquiJpaRepository;
import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.domain.model.MaquEqui;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.mapper.MapperFactory;
import br.com.itau.maquinas_equipamentos.port.repository.MaquEquiRepository;

@Repository
public class MaquEquiRepositoryImpl implements MaquEquiRepository {

	@Autowired
	private MaquEquiJpaRepository maquEquiJpaRepository;

	private final BemMapper bemMapper = MapperFactory.newInstance(BemMapper.class);

	@Override
	public MaquEqui incluir(MaquEqui maquEqui) {

		if (maquEqui == null)
			throw new NegocioException("O endereço não pode ser nulo");
		var maquEquiEntity = maquEquiJpaRepository.save(bemMapper.toMaquEquiEntity(maquEqui));
		return bemMapper.fromMaquEquiEntity(maquEquiEntity);
	}

	@Override
	public MaquEqui atualizar(MaquEqui maquEqui) {

		return this.incluir(maquEqui);
	}

	@Override
	public void deletar(String idTipoMaquEqui, int idTipoBem) {

		// TODO Auto-generated method stub

	}

	@Override
	public Optional<MaquEqui> consultarPorId(String idTipoMaquEqui, int idTipoBem) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long verificarSeExiste(String idTipoMaquEqui, int idTipoBem) {

		// TODO Auto-generated method stub
		return null;
	}

}
