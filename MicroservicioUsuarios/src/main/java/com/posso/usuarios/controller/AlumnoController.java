package com.posso.usuarios.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.posso.common.usuario.models.entity.Alumno;
import com.posso.commons.controller.CommonController;
import com.posso.usuarios.configuration.Configuration;
import com.posso.usuarios.service.AlumnoService;


@RestController
public class AlumnoController extends CommonController<Alumno, AlumnoService>{
	
	@Autowired
    Configuration configuration;

    @GetMapping("/endpoint")
    public String retrieveLimits(){
        return configuration.getValue();
    }

	
	@Value("${config.balanceador.test")
	private String balanceadorTest;
	
	@GetMapping("/balanceador-test")
	public ResponseEntity<?> balanceadorTest(){
		Map<String, Object> response = new HashMap<String, Object>();
				response.put("balanceador", balanceadorTest);
				response.put("alumno", service.findAll());
				
				return ResponseEntity.ok().body(response);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id){
		Optional<Alumno> ob = service.findById(id);
		
		if(ob.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		Alumno alumnoBd = ob.get();
		alumnoBd.setNombre(alumno.getNombre());
		alumnoBd.setApellido(alumno.getApellido());
		alumnoBd.setEmail(alumno.getEmail());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoBd));
	}
}