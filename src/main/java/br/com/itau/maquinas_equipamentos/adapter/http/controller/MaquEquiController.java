package br.com.itau.maquinas_equipamentos.adapter.http.controller;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.maquinas_equipamentos.domain.usecase.IncluirBemMaqu;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/garantias")
@CrossOrigin("*")
@RequiredArgsConstructor
public class MaquEquiController {

	private final IncluirBemMaqu incluirBemMaqu;
	
	@PostMapping("/incluir")
	@Transactional
	public ResponseEntity<BemDto> post(@Valid @RequestBody BemDto bemDto){
		return ResponseEntity.status(HttpStatus.CREATED).body(incluirBemMaqu.execute(bemDto));
	}
	
}
