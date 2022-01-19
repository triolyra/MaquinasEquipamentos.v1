package br.com.itau.maquinas_equipamentos.domain.exception;

public class BemNaoEncontradoException {

<<<<<<< Updated upstream
=======
@SuppressWarnings("serial")
public class BemNaoEncontradoException extends NegocioException {

	public BemNaoEncontradoException(String idBem, int idTipoBem) {
		super(new BemMaquEntityPK(idBem, idTipoBem).toString());
	}
>>>>>>> Stashed changes
}
