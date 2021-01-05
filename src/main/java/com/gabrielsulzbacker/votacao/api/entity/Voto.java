package com.gabrielsulzbacker.votacao.api.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Voto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "associado")
	@JsonIgnore
	private Associado associado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sessao")
	@JsonIgnore
	private Sessao sessao;

	@Column
	private Boolean voto;

	public Voto(Associado associado, Sessao sessao, Boolean voto) {
		this.associado = associado;
		this.sessao = sessao;
		this.voto = voto;
	}

}
