package com.atividade.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	

	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	

}