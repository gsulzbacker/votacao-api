package com.gabrielsulzbacker.votacao.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AssociadoNaoCadastradoException extends ResponseStatusException {

	public AssociadoNaoCadastradoException(){
	        super(HttpStatus.NOT_FOUND, "Associado nao cadastrado!");
	    }
	
}