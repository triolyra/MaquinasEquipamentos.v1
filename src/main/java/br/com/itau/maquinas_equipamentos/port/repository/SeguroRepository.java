package br.com.itau.maquinas_equipamentos.port.repository;


import java.util.Optional;

import org.springframework.stereotype.Component;

import br.com.itau.maquinas_equipamentos.domain.model.Seguro;

@Component
public interface SeguroRepository {

	Seguro incluir(Seguro seguro);
	
	Seguro atualizar(Seguro seguro);
	
	void deletar(String idBem, int idTipoBem);

	Optional<Seguro> consultarPorId(String idBem, int idTipoBem);

	Long verificarSeExiste(String idBem, int idTipoBem);

}
