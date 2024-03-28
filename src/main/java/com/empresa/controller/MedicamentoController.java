package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/url/Medicamento")
public class MedicamentoController {
	@Autowired
	private MedicamentoService MedicamentoService;
	

	@GetMapping
	public List<Medicamento> listaAlumno(){
		List<Medicamento> lstSalida = MedicamentoService.listaMedicamento();
		return lstSalida;
	}
	
	@GetMapping("/porNombreLike/{nombre}")
	public List<Medicamento> listaAlumnoPorNombre(@PathVariable("nombre") String nombre){
		List<Medicamento> lstSalida = MedicamentoService.listaMedicamentoPorNombre(nombre+"%");
		return lstSalida;
	}
	
	@GetMapping("/porId/{id}")
	public List<Medicamento> listaAlumnoPorId(@PathVariable("id") int id){
		List<Medicamento> lstSalida = MedicamentoService.listaMedicamentoPorId(id);
		return lstSalida;
	}
}
