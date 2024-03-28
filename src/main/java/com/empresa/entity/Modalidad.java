package com.empresa.entity;


import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name="modalidad")
public class Modalidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idModalidad;
	
	private String nombre;
	private int numHombres;
	private int numMujeres;
	private int edadMaxima;
	private int edadMinima;
	private String sede;
	
	@ManyToOne
	@JoinColumn(name = "idDeporte")
	private Deporte deporte;
	
	private int estado;
	
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape=Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss",timezone="America/Lima")
	private Date fechaRegistro;
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape=Shape.STRING,pattern="yyyy-MM-dd HH:mm:ss",timezone="America/Lima")
	private Date fechaActualizacion;
}
