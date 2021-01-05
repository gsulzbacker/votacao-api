package com.gabrielsulzbacker.votacao.api.controller;

import com.gabrielsulzbacker.votacao.api.service.*;
import com.gabrielsulzbacker.votacao.api.dto.*;
import com.gabrielsulzbacker.votacao.api.entity.Pauta;
import com.gabrielsulzbacker.votacao.api.entity.Sessao;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import lombok.AllArgsConstructor;
import java.util.List;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/pauta")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class PautaController {

	private PautaService pautaService;
	private SessaoService sessaoService;
	private VotoService votoService;

	@PostMapping("/cadastro")
    @ApiOperation("Cadastrar pauta")
	public ResponseEntity<String> cadastrarPauta(@RequestBody PautaDTO pautaDTO) {
		pautaService.cadastrarPauta(pautaDTO);
		return ResponseEntity.ok().body("Pauta cadastrada com sucesso!");
	}

	@GetMapping
    @ApiOperation("Listar pautas cadastradas")
	public ResponseEntity<List<Pauta>> listarPautas() {
		return ResponseEntity.ok().body(pautaService.listarPautas());
	}

	@PostMapping("/sessao/cadastro")
    @ApiOperation("Cadastrar sessao")
	public ResponseEntity<String> cadastrarSessao(@RequestBody SessaoDTO sessaoDTO) {
		sessaoService.cadastrarSessao(sessaoDTO);
		return ResponseEntity.ok().body("Sessao cadastrada com sucesso!");
	}

	@GetMapping("/sessao")
    @ApiOperation("Listar sessoes cadastradas")
	public ResponseEntity<List<Sessao>> listarSessoes() {
		return ResponseEntity.ok().body(sessaoService.listarSessoes());
	}

	@PostMapping("/sessao/votacao")
    @ApiOperation("Cadastrar voto")
	public ResponseEntity<String> cadastrarVoto(@RequestBody VotoDTO votoDTO) {
		votoService.cadastrarVoto(votoDTO);
		return ResponseEntity.ok().body("Voto cadastrado com sucesso!");
	}

	@GetMapping("/sessao/votos")
    @ApiOperation("Listar votos cadastrados")
	public ResponseEntity<List<VotoDTO>> listarVotos() {
		return ResponseEntity.ok().body(votoService.listarVotos());
	}

	@GetMapping("/sessao/votos/apuracao/{id}")
    @ApiOperation("Consultar resultado da votacao")
	public ResponseEntity<String> apurarResultado(@PathVariable Integer id) {
		return ResponseEntity.ok().body(votoService.apurarResultado(id));
	}

}
