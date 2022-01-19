package br.com.itau.maquinas_equipamentos.port.repository;

import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.itau.maquinas_equipamentos.domain.model.MaquEqui;

@Component
public interface MaquEquiRepository {

	MaquEqui incluir(MaquEqui maquEqui);

	MaquEqui atualizar(MaquEqui maquEqui);

	void deletar(String idTipoMaquEqui, int idTipoBem);

	Optional<MaquEqui> consultarPorId(String idTipoMaquEqui, int idTipoBem);

	Long verificarSeExiste(String idTipoMaquEqui, int idTipoBem);

}