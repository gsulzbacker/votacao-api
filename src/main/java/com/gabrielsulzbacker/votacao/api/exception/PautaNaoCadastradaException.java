package com.gabrielsulzbacker.votacao.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class PautaNaoCadastradaException extends ResponseStatusException {

	public PautaNaoCadastradaException(){
	        super(HttpStatus.NOT_FOUND, "Pauta nao cadastrada!");
	    }
	
}