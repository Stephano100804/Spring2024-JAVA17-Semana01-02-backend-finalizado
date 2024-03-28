package com.empresa.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "deporte")
public class Deporte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDeporte;
	private String nombre;
}
