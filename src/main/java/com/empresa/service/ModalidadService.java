package com.empresa.service;

import java.util.*;

import com.empresa.entity.Modalidad;

public interface ModalidadService {
	
	public abstract List<Modalidad> listaModalidad();
	public abstract Modalidad insertaModalidad(Modalidad obj);
}
