package com.empresa.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Modalidad;
import com.empresa.service.ModalidadService;

@RestController
@RequestMapping("/url/Modalidad")
public class ModalidadController {
	
	@Autowired
	private ModalidadService modalidadService;
	
	@GetMapping
	public List<Modalidad> listaModalida(){
		List<Modalidad> lstSalidad = modalidadService.listaModalidad();
		return lstSalidad;
	}
	
	@PostMapping
	public ResponseEntity<?> insertaModalidad(@RequestBody Modalidad obj){
		List<String> lstMensajes=new ArrayList<String>();
		obj.setEstado(1);
		obj.setFechaActualizacion(new Date());
		obj.setFechaRegistro(new Date());
		Modalidad objSalida= modalidadService.insertaModalidad(obj);
		if(objSalida==null) {
			lstMensajes.add("Error al registro");
		}
		else {
			lstMensajes.add("Registro Ingresado Correctamente");
		}
		return ResponseEntity.ok(lstMensajes);
	}
	
}
