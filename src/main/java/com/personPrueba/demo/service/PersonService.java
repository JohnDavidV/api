package com.personPrueba.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personPrueba.demo.entity.Person;
import com.personPrueba.demo.repository.PersonRepository;

/**
* Servicio para realizar operaciones relacionadas con la entidad Person.
* Fecha de creación: 03/07/2023
* Creado por: John David Vásquez Serna
*/
@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	/**
	* Crea un nuevo registro de persona en la base de datos.
	* @param person La instancia de Person a guardar
	* @return La instancia de Person guardada en la base de datos
	*/
	public Person crearRegistro(Person person) {
		return personRepository.save(person);
	}

	/**
	* Actualiza un registro existente de persona en la base de datos.
	* @param person La instancia de Person a actualizar
	* @return La instancia de Person actualizada en la base de datos
	*/
	public Person actualizarRegistro(Person person) {
		return personRepository.save(person);
	}

	/**
	* Obtiene una lista de todos los registros de personas almacenados en la base de datos.
	* @return Lista de instancias de Person almacenadas en la base de datos
	*/
	public List<Person> listarRegistros() {
		return personRepository.findAll();
	}

	/**
	* Elimina un registro de persona de la base de datos según el ID proporcionado.
	* @param id El ID del registro de persona a eliminar
	*/
	public void eliminarRegistro(Long id) {
		personRepository.deleteById(id);
	}
}


