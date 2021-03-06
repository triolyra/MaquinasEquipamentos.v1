package br.com.itau.maquinas_equipamentos.adapter.datastore.repository.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.itau.maquinas_equipamentos.adapter.datastore.repository.BemJpaRepository;
import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.domain.model.Bem;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.mapper.MapperFactory;
import br.com.itau.maquinas_equipamentos.port.repository.BemRepository;

@Repository
public class BemRepositoryImpl implements BemRepository {

	@Autowired
	private BemJpaRepository bemJpaRepository;

	private final BemMapper bemMapper = MapperFactory.newInstance(BemMapper.class);

	@Override
	public Bem incluir(Bem bem) {
		if (bem == null)
			throw new NegocioException("O bem não pode ser nulo");
		var bemEntity = bemJpaRepository.save(bemMapper.toBemEntity(bem));
		return bemMapper.fromBemEntity(bemEntity);
	}

	@Override
	public Bem atualizar(Bem bem) {
		return this.incluir(bem);
	}

	@Override
	public void deletar(String idBem, int idTipoBem) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Bem> consultarPorId(String idBem, int idTipoBem) {
		var bemPk = bemMapper.toEntityPk(idBem, idTipoBem);
		var bemEntityOptional = bemJpaRepository.findById(bemPk);
		if (bemEntityOptional.isEmpty()) {
			return Optional.empty();
			}
		var bem = bemMapper.fromBemEntity(bemEntityOptional.get());
		return Optional.of(bem);
	}

	@Override
	public Long verificarSeExiste(String idBem, int idTipoBem) {
		// TODO Auto-generated method stub
		return null;
	}
}
