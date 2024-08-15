package com.grayMatter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.grayMatter.entities.Person;

public interface PersonServiceInterface {

	public ResponseEntity<?> getAllPersons();
	public ResponseEntity<?> addPerson(Person person);
	public Optional<Person> getById(long id);
	public void deletePerson(long id);
	public Person updatePerson(Person p);
}
