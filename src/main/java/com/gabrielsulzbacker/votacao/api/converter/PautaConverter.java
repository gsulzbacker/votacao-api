package com.gabrielsulzbacker.votacao.api.converter;

import com.gabrielsulzbacker.votacao.api.dto.PautaDTO;
import com.gabrielsulzbacker.votacao.api.entity.Pauta;

public class PautaConverter {

    public static Pauta toEntity(PautaDTO pautaDTO){
        return new Pauta(pautaDTO.getNome(), pautaDTO.getDescricao());
    }
	
}
