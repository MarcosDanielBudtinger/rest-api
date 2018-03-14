package com.example.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.api.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	Pessoa findByCodigo(Long codigo);

}
