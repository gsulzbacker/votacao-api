package com.gabrielsulzbacker.votacao.api.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Associado {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "nome")
	private String nome;

	@OneToMany(mappedBy = "associado")
	@JsonIgnore
	private List<Voto> votos;

	public Associado(String nome) {
		this.nome = nome;
	}

}
