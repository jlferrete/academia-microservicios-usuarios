package com.formacionbdi.microservicios.app.usuarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
	
	@Query("select a from Alumno a where a.nombre like %?1% or a.apellidos like %?1%")
	public List<Alumno> findByNombreOrApellido(String term);	
}
