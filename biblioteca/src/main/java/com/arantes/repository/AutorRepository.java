package com.arantes.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.arantes.model.Autor;

public interface AutorRepository extends PagingAndSortingRepository<Autor, Long> {
	
	

}
