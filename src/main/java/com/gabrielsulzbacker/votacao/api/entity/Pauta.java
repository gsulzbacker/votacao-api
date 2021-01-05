package com.gabrielsulzbacker.votacao.api.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Pauta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "descricao")
	private String descricao;

	@OneToOne(mappedBy = "pauta")
    @JsonIgnore
	private Sessao sessao;

	public Pauta(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

}
