package com.gabrielsulzbacker.votacao.api.converter;

import com.gabrielsulzbacker.votacao.api.dto.AssociadoDTO;
import com.gabrielsulzbacker.votacao.api.entity.Associado;

public class AssociadoConverter {

    public static Associado toEntity(AssociadoDTO associadoDTO){
        return new Associado(associadoDTO.getNome());
    }
	
}
