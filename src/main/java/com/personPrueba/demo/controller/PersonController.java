package com.personPrueba.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personPrueba.demo.entity.Person;
import com.personPrueba.demo.service.PersonService;

/**
* Controller para realizar operaciones relacionadas con la entidad Person.
* Fecha de creación: 03/07/2023
* Creado por: John David Vásquez Serna
*/
@RestController
@RequestMapping("/person")
@CrossOrigin(origins = "*")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	/**
	* Crea un nuevo registro de persona.
	* @param person La instancia de Person a crear
	* @return La instancia de Person creada
	*/
	@PostMapping("/crear")
	public Person createPerson(@RequestBody Person person) {
		return personService.crearRegistro(person);
	}

	/**
	* Actualiza un registro existente de persona.
	* @param person La instancia de Person a actualizar
	* @return La instancia de Person actualizada
	*/
	@PutMapping("/actualizar") 
	public Person updatePerson(@RequestBody Person person) {
		return personService.actualizarRegistro(person);
	}

	/**
	* Obtiene una lista de todos los registros de personas.
	* @return Lista de instancias de Person
	*/
	@GetMapping("/listar")
	public List<Person> getAllPersons() {
		return personService.listarRegistros();
	}

	/**
	* Elimina un registro de persona según el ID proporcionado.
	* @param id El ID del registro de persona a eliminar
	*/
	@DeleteMapping("/eliminar/{id}")
	public void deletePerson(@PathVariable Long id) {
		personService.eliminarRegistro(id);
	}
}

