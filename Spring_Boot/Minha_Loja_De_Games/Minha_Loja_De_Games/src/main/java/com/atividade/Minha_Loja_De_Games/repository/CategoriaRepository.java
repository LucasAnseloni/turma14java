package com.atividade.Minha_Loja_De_Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atividade.Minha_Loja_De_Games.model.Categoria;


@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List<Categoria> findAllBytemaJogoContainingIgnoreCase (String temaJogo);

}
