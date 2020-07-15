package com.formacionbdi.microservicios.app.usuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Long> {
	
	@Query("select a from Alumno a where upper(a.nombre) like upper(concat('%', ?1,'%')) or upper(a.apellido) like upper(concat('%', ?1, '%'))")
	public List<Alumno> findByNombreOrApellido(String term);	
}
