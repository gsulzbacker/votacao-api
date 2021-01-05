package com.gabrielsulzbacker.votacao.api.repository;

import com.gabrielsulzbacker.votacao.api.entity.Voto;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface VotoRepository extends CrudRepository<Voto, Integer> {
	List<Voto> findAll();
}
