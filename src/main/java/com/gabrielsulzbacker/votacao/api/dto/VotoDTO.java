package com.gabrielsulzbacker.votacao.api.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class VotoDTO {

	private Integer idAssociado;
	private Integer idSessao;
	private Boolean voto;

	public VotoDTO(Integer idAssociado, Integer idSessao, Boolean voto) {
		this.idAssociado = idAssociado;
		this.idSessao = idSessao;
		this.voto = voto;

	}
}