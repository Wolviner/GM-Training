package com.grayMatter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grayMatter.entities.Person;
import com.grayMatter.services.PersonServiceImpl;

@RestController
@RequestMapping("/api/v1")
public class PersonController {

	@Autowired
	PersonServiceImpl service;
	
	@GetMapping("/person")
	public ResponseEntity<?> getAllPersons(){
		return service.getAllPersons();	
		
	}
	
	@PostMapping("/person")
	public  ResponseEntity<?> addPerson(@RequestBody Person person) {
		return service.addPerson (person);
	}
	@RequestMapping(value="/person/{id}",method=RequestMethod.PUT)
	public  Optional<Person> getById(@PathVariable("id") long id) {
		return service.getById(id);
	}
	
	@DeleteMapping(value="/person/delete/{id}")
	public void deletePerson(@PathVariable("id") long id) {
		service.deletePerson(id);
	}
	@PutMapping(value="/person/update")
	public Person updatePerson(@RequestBody Person person) {
		return service.updatePerson(person);
	}
	
}
