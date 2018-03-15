package com.example.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.api.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

	Lancamento findByCodigo(Long codigo);
}
