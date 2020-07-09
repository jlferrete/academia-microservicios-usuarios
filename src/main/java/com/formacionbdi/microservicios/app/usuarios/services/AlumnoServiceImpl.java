package com.formacionbdi.microservicios.app.usuarios.services;

import org.springframework.stereotype.Service;

import com.formacionbdi.microservicios.app.usuarios.repository.AlumnoRepository;
import com.formacionbdi.microservicios.commons.alumnos.models.entity.Alumno;
import com.formacionbdi.microservicios.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

}
