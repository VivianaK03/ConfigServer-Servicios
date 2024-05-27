package com.posso.usuarios.repository;


import org.springframework.data.repository.CrudRepository;

import com.posso.common.usuario.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

}