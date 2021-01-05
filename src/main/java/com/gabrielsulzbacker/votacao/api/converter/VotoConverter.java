package com.gabrielsulzbacker.votacao.api.converter;

import com.gabrielsulzbacker.votacao.api.dto.VotoDTO;
import com.gabrielsulzbacker.votacao.api.entity.Associado;
import com.gabrielsulzbacker.votacao.api.entity.Sessao;
import com.gabrielsulzbacker.votacao.api.entity.Voto;

public class VotoConverter {

	public static Voto toEntity(Associado associado, Sessao sessao, VotoDTO votoDTO) {
		return new Voto(associado, sessao, votoDTO.getVoto());
	}

    public static VotoDTO toDTO(Voto voto){
        return new VotoDTO(voto.getAssociado().getId(), voto.getSessao().getId(), voto.getVoto());
    }

}
