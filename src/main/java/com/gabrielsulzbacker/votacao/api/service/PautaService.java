package com.gabrielsulzbacker.votacao.api.service;

import com.gabrielsulzbacker.votacao.api.repository.PautaRepository;
import com.gabrielsulzbacker.votacao.api.dto.PautaDTO;
import com.gabrielsulzbacker.votacao.api.entity.Pauta;
import com.gabrielsulzbacker.votacao.api.exception.PautaNaoCadastradaException;
import com.gabrielsulzbacker.votacao.api.converter.PautaConverter;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import java.util.List;

@Service
@AllArgsConstructor
public class PautaService {

	private PautaRepository pautaRepository;

	public void cadastrarPauta(PautaDTO pautaDTO) {
		Pauta pauta = PautaConverter.toEntity(pautaDTO);
		pautaRepository.save(pauta);
	}

	public Pauta consultarPauta(Integer id) {
		return pautaRepository.findById(id).orElseThrow(PautaNaoCadastradaException::new);
	}

	public List<Pauta> listarPautas() {
		return pautaRepository.findAll();
	}

}
