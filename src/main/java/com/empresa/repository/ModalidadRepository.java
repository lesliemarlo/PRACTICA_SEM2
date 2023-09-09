package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Modalidad;

public interface ModalidadRepository extends JpaRepository<Modalidad, Integer>{
//jbkj bkj
	public List<Modalidad> findByNombreIgnoreCase(String nombre);
}

