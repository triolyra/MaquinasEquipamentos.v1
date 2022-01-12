package br.com.itau.maquinas_equipamentos.adapter.http.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.maquinas_equipamentos.domain.usecase.IncluirBem;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;

@RestController
@RequestMapping("/garantias")
@CrossOrigin("*")
public class MaquEquiController {

	@Autowired
	private IncluirBem incluirBem;

	@PostMapping("/incluir")
	public ResponseEntity<BemDto> incluirBem(@RequestBody BemDto bem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(incluirBem.incluir(bem));
	}

}