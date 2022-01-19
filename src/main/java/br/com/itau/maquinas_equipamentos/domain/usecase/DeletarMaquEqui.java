package br.com.itau.maquinas_equipamentos.domain.usecase;

<<<<<<< Updated upstream:src/main/java/br/com/itau/maquinas_equipamentos/domain/usecase/DeletarMaquEqui.java
public class DeletarMaquEqui {
=======
import javax.inject.Inject;
import javax.inject.Named;

import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import br.com.itau.maquinas_equipamentos.port.dto.EnderecoDto;
import br.com.itau.maquinas_equipamentos.port.dto.MaquEquiDto;
import br.com.itau.maquinas_equipamentos.port.dto.PessoaDto;
import br.com.itau.maquinas_equipamentos.port.dto.SeguroDto;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.mapper.MapperFactory;
import br.com.itau.maquinas_equipamentos.port.repository.BemRepository;
import br.com.itau.maquinas_equipamentos.port.repository.EnderecoRepository;
import br.com.itau.maquinas_equipamentos.port.repository.MaquEquiRepository;
import br.com.itau.maquinas_equipamentos.port.repository.PessoaRepository;

@Named
public class AtualizarBemMaqu {
>>>>>>> Stashed changes:src/main/java/br/com/itau/maquinas_equipamentos/domain/usecase/AtualizarBemMaqu.java

	private final BemRepository bemRepository;
	private final EnderecoRepository enderecoRepository;
	private final MaquEquiRepository maquEquiRepository;
	private final PessoaRepository pessoaRepository;

	private final BemMapper bemMapper = MapperFactory.newInstance(BemMapper.class);

	@Inject
	public AtualizarBemMaqu(BemRepository bemRepository, EnderecoRepository enderecoRepository,
			MaquEquiRepository maquEquiRepository, PessoaRepository pessoaRepository) {
		this.bemRepository = bemRepository;
		this.enderecoRepository = enderecoRepository;
		this.maquEquiRepository = maquEquiRepository;
		this.pessoaRepository = pessoaRepository;
	}

	public BemDto execute(BemDto bemDto) {
		if (bemDto == null)
			throw new NegocioException("O bem DTO não pode ser nulo");

		var bem = bemMapper.fromBemDto(bemDto);
		var bemAtualizado = bemRepository.atualizar(bem);
		var bemAtualizadoDto = bemMapper.toBemDto(bemAtualizado);
		return bemAtualizadoDto;
	}

	public EnderecoDto execute(EnderecoDto enderecoDto) {
		if (enderecoDto == null)
			throw new NegocioException("O endereço DTO não pode ser nulo");

		var endereco = bemMapper.fromEnderecoDto(enderecoDto);
		var enderecoAtualizado = enderecoRepository.atualizar(endereco);
		var enderecoAtualizadoDto = bemMapper.toEnderecoDto(enderecoAtualizado);
		return enderecoAtualizadoDto;
	}

	public MaquEquiDto execute(MaquEquiDto maquEquiDto) {
		if (maquEquiDto == null)
			throw new NegocioException("O bem máquina equipamento DTO não pode ser nulo");

		var maquEqui = bemMapper.fromMaquEquiDto(maquEquiDto);
		var maquEquiAtualizada = maquEquiRepository.incluir(maquEqui);
		var maquEquiAtualizadaDto = bemMapper.toMaquEquiDto(maquEquiAtualizada);
		return maquEquiAtualizadaDto;

	}

	public PessoaDto execute(PessoaDto pessoaDto) {
		if (pessoaDto == null)
			throw new NegocioException("O pessoa DTO não pode ser nulo");

		var pessoa = bemMapper.fromPessoaDto(pessoaDto);
		var pessoaAtualizada = pessoaRepository.incluir(pessoa);
		var pessoaAtualizadaDto = bemMapper.toPessoaDto(pessoaAtualizada);
		return pessoaAtualizadaDto;
	}

	public SeguroDto execute(SeguroDto seguroDto) {
		if (seguroDto == null)
			throw new NegocioException("O seguro DTO não pode ser nulo");

		var seguro = bemMapper.fromSeguroDto(seguroDto);
		var seguroAtualizado = seguroRepository.incluir(seguro);
		var seguroAtualizadoDto = bemMapper.toSeguroDto(seguroAtualizado);
		return seguroAtualizadoDto;
	}
}
