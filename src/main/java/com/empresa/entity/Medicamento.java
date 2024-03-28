package com.empresa.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "medicamento")
@Getter
@Setter
public class Medicamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int idMedicamento;
	public String nombre;
	public double precio;
	public int stock;
	public String laboratorio;
}
