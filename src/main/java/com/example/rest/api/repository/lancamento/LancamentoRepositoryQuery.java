package com.example.rest.api.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.rest.api.model.Lancamento;
import com.example.rest.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar (LancamentoFilter lancamentoFilter, Pageable pageable);
}