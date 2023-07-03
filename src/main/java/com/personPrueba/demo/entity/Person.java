package com.personPrueba.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
* Esta clase representa la tabla de la base de datos que almacena información de personas.
* Fecha de creación: 03/07/2023
* Creado por: John David Vásquez Serna
*/
@Entity
@Data
@Table (name = "PERSON")
public class Person {

	//Campo para almacenar el identificador de cada registro.
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Long id;
	
	//Campo para almacenar el nombre de la persona.
	@Column(name = "NOMBRE")
	@JsonProperty("nombre")
	private String nombre;
	
	//Campo para almacenar el número teléfonico de la persona.
	@Column(name = "NUMERO_TELEFONICO")
	@JsonProperty("numeroTelefonico")
	private String numeroTelefonico;
	
	//Campo para almacenar el correo electrónico de la persona.
	@Column(name = "CORREO_ELECTRONICO")
	@JsonProperty("correoElectronico")
	private String correoElectronico;
}

