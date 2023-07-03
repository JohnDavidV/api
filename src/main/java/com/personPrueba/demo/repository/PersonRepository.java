package com.personPrueba.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personPrueba.demo.entity.Person;

/**
* Repository para realizar operaciones relacionadas con la entidad Person.
* Fecha de creación: 03/07/2023
* Creado por: John David Vásquez Serna
*/
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}

