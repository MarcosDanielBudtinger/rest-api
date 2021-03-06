package com.example.rest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	Categoria findByCodigo(Long codigo);
}
