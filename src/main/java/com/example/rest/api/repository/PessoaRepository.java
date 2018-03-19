package com.example.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.api.model.Pessoa;
import com.example.rest.api.repository.pessoa.PessoaRepositoryQuery;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>, PessoaRepositoryQuery{

	Pessoa findByCodigo(Long codigo);

}
