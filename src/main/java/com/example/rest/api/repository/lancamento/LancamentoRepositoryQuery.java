package com.example.rest.api.repository.lancamento;

import java.util.List;

import com.example.rest.api.model.Lancamento;
import com.example.rest.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {

	public List<Lancamento> filtrar (LancamentoFilter lancamentoFilter);
}
