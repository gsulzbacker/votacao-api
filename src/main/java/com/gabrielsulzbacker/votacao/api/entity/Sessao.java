package com.gabrielsulzbacker.votacao.api.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Sessao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    @JsonIgnore
	private Pauta pauta;
    
    @OneToMany(mappedBy = "sessao")
    @JsonIgnore
	private List<Voto> votos;
	
    public Sessao(Pauta pauta) {
        this.pauta = pauta;
    }
	
}
