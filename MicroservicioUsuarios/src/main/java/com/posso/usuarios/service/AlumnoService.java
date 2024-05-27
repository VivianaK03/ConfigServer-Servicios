package com.posso.usuarios.service;


import com.posso.common.usuario.models.entity.Alumno;
import com.posso.commons.service.CommonService;

public interface AlumnoService extends CommonService<Alumno> {
	
	public Alumno save(Alumno alumno);
	
	public void deleteById (Long id);

}