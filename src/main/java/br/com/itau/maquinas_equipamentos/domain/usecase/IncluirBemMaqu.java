package br.com.itau.maquinas_equipamentos.domain.usecase;

import javax.inject.Inject;
import javax.inject.Named;

import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import br.com.itau.maquinas_equipamentos.port.dto.EnderecoDto;
import br.com.itau.maquinas_equipamentos.port.dto.MaquEquiDto;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.mapper.MapperFactory;
import br.com.itau.maquinas_equipamentos.port.repository.BemRepository;
import br.com.itau.maquinas_equipamentos.port.repository.EnderecoRepository;
import br.com.itau.maquinas_equipamentos.port.repository.MaquEquiRepository;

@Named
public class IncluirBemMaqu {

	private final BemRepository bemRepository;
	private final EnderecoRepository enderecoRepository;
	private final MaquEquiRepository maquEquiRepository;
	private final BemMapper bemMapper = MapperFactory.newInstance(BemMapper.class);

	@Inject
	public IncluirBemMaqu(BemRepository bemRepository, EnderecoRepository enderecoRepository,MaquEquiRepository maquEquiRepository) {
		this.bemRepository = bemRepository;
		this.enderecoRepository = enderecoRepository;
		this.maquEquiRepository = maquEquiRepository;
	}
	
	public BemDto execute(BemDto bemDto) {
		if (bemDto == null)
			throw new NegocioException("O bem DTO não pode ser nulo");

		var bem = bemMapper.fromBemDto(bemDto);
		var bemSalvo = bemRepository.incluir(bem);
		var bemSalvoDto = bemMapper.toBemDto(bemSalvo);
		return bemSalvoDto;
	}

	public EnderecoDto execute(EnderecoDto enderecoDto) {
		if (enderecoDto == null)
			throw new NegocioException("O endereço DTO não pode ser nulo");

		var endereco = bemMapper.fromEnderecoDto(enderecoDto);
		var enderecoSalvo = enderecoRepository.incluir(endereco);
		var enderecoSalvoDto = bemMapper.toEnderecoDto(enderecoSalvo);
		return enderecoSalvoDto;
	}
	public MaquEquiDto execute(MaquEquiDto maquEquiDto) {
		if (maquEquiDto == null)
			throw new NegocioException("O bem máquina equipamento DTO não pode ser nulo");

		var maquEqui = bemMapper.fromMaquEquiDto(maquEquiDto);
		var maquEquiSalva = maquEquiRepository.incluir(maquEqui);
		var maquEquiSalvaDto = bemMapper.toMaquEquiDto(maquEquiSalva);
		return maquEquiSalvaDto;

	}
}
