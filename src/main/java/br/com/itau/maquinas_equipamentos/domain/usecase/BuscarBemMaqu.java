package br.com.itau.maquinas_equipamentos.domain.usecase;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.itau.maquinas_equipamentos.domain.exception.BemNaoEncontradoException;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.mapper.MapperFactory;
import br.com.itau.maquinas_equipamentos.port.repository.BemRepository;

@Named
public class BuscarBemMaqu {

	private final BemRepository bemRepository;
	private final BemMapper bemMapper = MapperFactory.newInstance(BemMapper.class);

	@Inject
	public BuscarBemMaqu(BemRepository bemRepository) {
		this.bemRepository = bemRepository;
	}

	public BemDto execute(String idBem, int idTipoBem) {
		var bemOptional = bemRepository.consultarPorId(idBem, idTipoBem);
		if (bemOptional.isEmpty()) {
			throw new BemNaoEncontradoException(idBem, idTipoBem);
		}
		return bemMapper.toBemDto(bemOptional.get());
	}
}
