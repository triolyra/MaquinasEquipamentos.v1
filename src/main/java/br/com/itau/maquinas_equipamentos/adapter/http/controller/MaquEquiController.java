package br.com.itau.maquinas_equipamentos.adapter.http.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.maquinas_equipamentos.domain.exception.NegocioException;
import br.com.itau.maquinas_equipamentos.domain.usecase.BuscarBemMaqu;
import br.com.itau.maquinas_equipamentos.domain.usecase.IncluirBemMaqu;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import br.com.itau.maquinas_equipamentos.port.dto.EnderecoDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/garantias")
@CrossOrigin("*")
@RequiredArgsConstructor
public class MaquEquiController {

	private final IncluirBemMaqu incluirBemMaqu;
	
	private final BuscarBemMaqu buscarBemMaqu;

	@PostMapping("/incluir")
	@Transactional
	public ResponseEntity<BemDto> incluirBem(@Valid @RequestBody BemDto bemDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(incluirBemMaqu.execute(bemDto));
	}

	@PostMapping("/incluir/endereco")
	@Transactional
	public ResponseEntity<EnderecoDto> incluirEndereco(@Valid @RequestBody EnderecoDto enderecoDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(incluirBemMaqu.execute(enderecoDto));
	}

	@GetMapping("/{idTipoBem}/bens/{idBem}/maquinas-equipamentos")
	public ResponseEntity<BemDto> buscarPorId(@PathVariable ("idTipoBem") BemDto idTipoBem, @PathVariable ("idBem") BemDto idBem)
			throws NegocioException{
		BemDto bemDto;
		return null;
	}
}

