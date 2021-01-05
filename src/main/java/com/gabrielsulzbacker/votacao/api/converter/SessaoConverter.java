package com.gabrielsulzbacker.votacao.api.converter;

import com.gabrielsulzbacker.votacao.api.entity.Pauta;
import com.gabrielsulzbacker.votacao.api.entity.Sessao;

public class SessaoConverter {

    public static Sessao toEntity(Pauta pauta){
        return new Sessao(pauta);
    }
	
}
