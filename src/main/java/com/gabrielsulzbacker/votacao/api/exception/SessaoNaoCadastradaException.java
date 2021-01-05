package com.gabrielsulzbacker.votacao.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class SessaoNaoCadastradaException extends ResponseStatusException {

	public SessaoNaoCadastradaException(){
	        super(HttpStatus.NOT_FOUND, "Sessao nao cadastrada!");
	    }
	
}