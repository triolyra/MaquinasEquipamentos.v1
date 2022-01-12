package br.com.itau.maquinas_equipamentos.adapter.datastore.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.domain.model.Bem;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.repository.BemRepository;

@Repository
public class BemRepositoryImpl implements BemRepository{

	@Autowired private BemJpaRepository bemJpaRepository;

	private BemMapper bemMapper;

	@Override
	public Bem incluir(Bem bem) {
		if (bem == null) throw new NegocioException("O bem não pode ser nulo");
		var bemEntity = bemJpaRepository.save(bemMapper.toEntity(bem));
		return bemMapper.fromEntity(bemEntity);
	}
}