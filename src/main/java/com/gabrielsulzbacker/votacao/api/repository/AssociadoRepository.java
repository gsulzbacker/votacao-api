package com.gabrielsulzbacker.votacao.api.repository;

import com.gabrielsulzbacker.votacao.api.entity.Associado;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

@Repository
public interface AssociadoRepository extends CrudRepository<Associado, Integer> {
	List<Associado> findAll();
}
