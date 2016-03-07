package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.model.Veiculo;

public interface Veiculos extends JpaRepository<Veiculo, Long> {

}
