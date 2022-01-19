package br.com.itau.maquinas_equipamentos.adapter.datastore.repository.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.itau.maquinas_equipamentos.adapter.datastore.repository.SeguroJpaRepository;
import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.domain.model.Seguro;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.mapper.MapperFactory;
import br.com.itau.maquinas_equipamentos.port.repository.SeguroRepository;

@Repository
public class SeguroRepositoryImpl  implements SeguroRepository {

	@Autowired
	private SeguroJpaRepository seguroJpaRepository;
	
	private final BemMapper bemMapper = MapperFactory.newInstance(BemMapper.class);
	@Override
	public Seguro incluir(Seguro seguro) {
		if (seguro == null)
			throw new NegocioException("O seguro não pode ser nulo");
		var seguroEntity = seguroJpaRepository.save(bemMapper.toSeguroEntity(seguro));
		return bemMapper.fromSeguroEntity(seguroEntity);
	}

	@Override
	public Seguro atualizar(Seguro seguro) {
		return this.incluir(seguro);
	}

	@Override
	public void deletar(String idBem, int idTipoBem) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Seguro> consultarPorId(String idBem, int idTipoBem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long verificarSeExiste(String idBem, int idTipoBem) {
		// TODO Auto-generated method stub
		return null;
	}

}
