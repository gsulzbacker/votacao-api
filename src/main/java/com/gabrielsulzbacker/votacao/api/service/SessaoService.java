package com.gabrielsulzbacker.votacao.api.service;

import com.gabrielsulzbacker.votacao.api.repository.SessaoRepository;
import com.gabrielsulzbacker.votacao.api.dto.SessaoDTO;
import com.gabrielsulzbacker.votacao.api.entity.Sessao;
import com.gabrielsulzbacker.votacao.api.entity.Pauta;
import com.gabrielsulzbacker.votacao.api.exception.SessaoNaoCadastradaException;
import com.gabrielsulzbacker.votacao.api.converter.SessaoConverter;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import java.util.List;

@Service
@AllArgsConstructor
public class SessaoService {

	private SessaoRepository sessaoRepository;
	private PautaService pautaService;

	public void cadastrarSessao(SessaoDTO sessaoDTO) {
		Pauta pauta = pautaService.consultarPauta(sessaoDTO.getIdPauta());
		Sessao sessao = SessaoConverter.toEntity(pauta);
		sessaoRepository.save(sessao);
	}

	public Sessao consultarSessao(Integer id) {
		return sessaoRepository.findById(id).orElseThrow(SessaoNaoCadastradaException::new);
	}

	public List<Sessao> listarSessoes() {
		return sessaoRepository.findAll();
	}

}
