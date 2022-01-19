package br.com.itau.maquinas_equipamentos.adapter.datastore.repository.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import br.com.itau.maquinas_equipamentos.adapter.datastore.repository.PessoaJpaRepository;
import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.domain.model.Pessoa;
import br.com.itau.maquinas_equipamentos.port.mapper.BemMapper;
import br.com.itau.maquinas_equipamentos.port.mapper.MapperFactory;
import br.com.itau.maquinas_equipamentos.port.repository.PessoaRepository;

@Repository
public class PessoaRepositoryImpl implements PessoaRepository {

	@Autowired
	private PessoaJpaRepository pessoaJpaRepository;

	private final BemMapper bemMapper = MapperFactory.newInstance(BemMapper.class);

	@Override
	public Pessoa incluir(Pessoa pessoa) {
		if (pessoa == null)
			throw new NegocioException("O bem não pode ser nulo");
		var pessoaEntity = pessoaJpaRepository.save(bemMapper.toPessoaEntity(pessoa));
		return bemMapper.fromPessoaEntity(pessoaEntity);
	}

	@Override
	public Pessoa atualizar(Pessoa pessoa) {
		return this.incluir(pessoa);
	}

	@Override
	public void deletar(String idBem, int idTipoBem) {
		// TODO Auto-generated method stub

	}

	@Override
	public Optional<Pessoa> consultarPorId(String idContratoPessoa, int idTipoBem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long verificarSeExiste(String idContratoPessoa, int idTipoBem) {
		// TODO Auto-generated method stub
		return null;
	}

}
