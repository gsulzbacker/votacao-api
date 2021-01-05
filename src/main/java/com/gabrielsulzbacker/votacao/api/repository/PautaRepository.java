package com.gabrielsulzbacker.votacao.api.repository;

import com.gabrielsulzbacker.votacao.api.entity.Pauta;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface PautaRepository extends CrudRepository<Pauta, Integer> {
	List<Pauta> findAll();
}
