package br.com.itau.maquinas_equipamentos.domain.usecase;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.itau.maquinas_equipamentos.adapter.datastore.repository.impl.BemRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.repository.BemRepository;

@Named
@Component
public class IncluirBem {
	@Autowired
	private BemRepositoryImpl bemRepository;
	@Autowired
	private BemMapper bemMapper;

//	@Inject
//	public IncluirBem (BemRepository bemRepository, BemMapper bemMapper) {
//		this.bemRepository = bemRepository;
//		this.bemMapper = bemMapper;
//	}

	public BemDto incluir(BemDto bemDto) {
		if (bemDto == null) throw new NegocioException("Não pode ser nulo");
		var bem = bemMapper.fromDto(bemDto);
		var bemIncluso = bemRepository.incluir(bem);
		var bemInclusoDto = bemMapper.toDto(bemIncluso);
		return bemInclusoDto;
	}
}
