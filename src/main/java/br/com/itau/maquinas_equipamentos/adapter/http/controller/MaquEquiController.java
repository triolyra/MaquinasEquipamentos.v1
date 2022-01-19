package br.com.itau.maquinas_equipamentos.adapter.http.controller;

<<<<<<< Updated upstream
import org.springframework.beans.factory.annotation.Autowired;
=======
import javax.transaction.Transactional;

import javax.validation.Valid;

>>>>>>> Stashed changes
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itau.maquinas_equipamentos.domain.usecase.IncluirBem;
import br.com.itau.maquinas_equipamentos.port.dto.BemDto;
<<<<<<< Updated upstream
=======
import br.com.itau.maquinas_equipamentos.port.dto.EnderecoDto;
import br.com.itau.maquinas_equipamentos.port.dto.MaquEquiDto;
import lombok.RequiredArgsConstructor;
>>>>>>> Stashed changes

@RestController
@RequestMapping("/garantias")
@CrossOrigin("*")
public class MaquEquiController {

<<<<<<< Updated upstream
	@Autowired
	private IncluirBem incluirBem;

	@PostMapping("/incluir")
	public ResponseEntity<BemDto> incluirBem(@RequestBody BemDto bem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(incluirBem.incluir(bem));
	}

}
=======
	private final IncluirBemMaqu incluirBemMaqu;

	//private final BuscarBemMaqu buscarBemMaqu;

	@PostMapping("/incluir")
	@Transactional
	public ResponseEntity<BemDto> incluirBem(@Valid @RequestBody BemDto bemDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(incluirBemMaqu.execute(bemDto));
	}

	@PostMapping("/incluir/endereco")
	@Transactional
	public ResponseEntity<EnderecoDto> incluirEndereco(@Valid @RequestBody EnderecoDto enderecoDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(incluirBemMaqu.execute(enderecoDto));
	}


	//@GetMapping("/{idTipoBem}/bens/{idBem}/maquinas-equipamentos")
	//public ResponseEntity<BemDto> buscarPorId(@PathVariable("idTipoBem") BemDto idTipoBem,
	//		@PathVariable("idBem") BemDto idBem) throws NegocioException {
	//	BemDto bemDto;
	//	return null;
	//}

	@PostMapping("/incluir/maquEqui")
	@Transactional
	public ResponseEntity<MaquEquiDto> post(@Valid @RequestBody MaquEquiDto maquEquiDto) {
		return ResponseEntity.status(HttpStatus.CREATED).body(incluirBemMaqu.execute(maquEquiDto));
	}
}
>>>>>>> Stashed changes
