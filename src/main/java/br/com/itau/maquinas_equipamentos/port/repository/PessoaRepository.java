package br.com.itau.maquinas_equipamentos.port.repository;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.itau.maquinas_equipamentos.domain.model.Pessoa;

@Component
public interface PessoaRepository {
	Pessoa incluir(Pessoa maquEqui);

	Pessoa atualizar(Pessoa maquEqui);

	void deletar(String idContratoPessoa, int idTipoBem);

	Optional<Pessoa> consultarPorId(String idContratoPessoa, int idTipoBem);

	Long verificarSeExiste(String idContratoPessoa, int idTipoBem);

}
