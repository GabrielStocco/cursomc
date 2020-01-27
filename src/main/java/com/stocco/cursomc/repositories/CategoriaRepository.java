package com.stocco.cursomc.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stocco.cursomc.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
	
	

}
