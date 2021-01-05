package com.gabrielsulzbacker.votacao.api.controller;

import com.gabrielsulzbacker.votacao.api.service.AssociadoService;
import com.gabrielsulzbacker.votacao.api.dto.AssociadoDTO;
import com.gabrielsulzbacker.votacao.api.entity.Associado;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import lombok.AllArgsConstructor;
import java.util.List;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/associados")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class AssociadoController {

	private AssociadoService associadoService;

	@PostMapping("/cadastro")
    @ApiOperation("Cadastrar associado")
	public ResponseEntity<String> cadastrarAssociado(@RequestBody AssociadoDTO associadoDTO) {
		associadoService.cadastrarAssociado(associadoDTO);
		return ResponseEntity.ok().body("Associado cadastrado com sucesso!");
	}

	@GetMapping
    @ApiOperation("Listar associados cadastrados")
	public ResponseEntity<List<Associado>> listarAssociados() {
		return ResponseEntity.ok().body(associadoService.listarAssociados());
	}

}
