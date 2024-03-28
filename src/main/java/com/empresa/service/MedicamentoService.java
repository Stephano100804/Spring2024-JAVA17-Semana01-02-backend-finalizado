package com.empresa.service;

import java.util.List;

import com.empresa.entity.*;

public interface MedicamentoService {
	public abstract List<Medicamento> listaMedicamento();
	public abstract List<Medicamento> listaMedicamentoPorNombre(String nombre);
	public abstract List<Medicamento> listaMedicamentoPorId(int id);
}
