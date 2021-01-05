package com.gabrielsulzbacker.votacao.api.service;

import com.gabrielsulzbacker.votacao.api.repository.VotoRepository;
import com.gabrielsulzbacker.votacao.api.dto.VotoDTO;
import com.gabrielsulzbacker.votacao.api.entity.*;
import com.gabrielsulzbacker.votacao.api.converter.VotoConverter;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VotoService {

	private VotoRepository votoRepository;
	private AssociadoService associadoService;
	private SessaoService sessaoService;

	public void cadastrarVoto(VotoDTO votoDTO) {
		Associado associado = associadoService.consultarAssociado(votoDTO.getIdAssociado());
		Sessao sessao = sessaoService.consultarSessao(votoDTO.getIdSessao());
		Voto voto = VotoConverter.toEntity(associado, sessao, votoDTO);
		votoRepository.save(voto);
	}

	public String apurarResultado(Integer id) {
		Sessao sessao = sessaoService.consultarSessao(id);
		List<Voto> votos = sessao.getVotos();
		long votosSim = votos.stream().filter(Voto::getVoto).count();
		long votosNao = votos.stream().filter(voto -> !voto.getVoto()).count();
		return "SIM: " + votosSim + "\nNAO: " + votosNao;
	}

	public List<VotoDTO> listarVotos() {
		return votoRepository.findAll().stream().map(VotoConverter::toDTO).collect(Collectors.toList());
	}

}
