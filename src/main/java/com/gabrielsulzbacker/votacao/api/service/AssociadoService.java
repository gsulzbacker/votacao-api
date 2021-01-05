package com.gabrielsulzbacker.votacao.api.service;

import com.gabrielsulzbacker.votacao.api.repository.AssociadoRepository;
import com.gabrielsulzbacker.votacao.api.dto.AssociadoDTO;
import com.gabrielsulzbacker.votacao.api.entity.Associado;
import com.gabrielsulzbacker.votacao.api.exception.AssociadoNaoCadastradoException;
import com.gabrielsulzbacker.votacao.api.converter.AssociadoConverter;
import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;
import java.util.List;

@Service
@AllArgsConstructor
public class AssociadoService {

	private AssociadoRepository associadoRepository;

	public void cadastrarAssociado(AssociadoDTO associadoDTO) {
		Associado associado = AssociadoConverter.toEntity(associadoDTO);
		associadoRepository.save(associado);
	}

	public Associado consultarAssociado(Integer id) {
		return associadoRepository.findById(id).orElseThrow(AssociadoNaoCadastradoException::new);
	}

	public List<Associado> listarAssociados() {
		return associadoRepository.findAll();
	}

}
