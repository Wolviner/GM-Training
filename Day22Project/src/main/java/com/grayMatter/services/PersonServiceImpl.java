package com.grayMatter.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.grayMatter.dao.PersonDao;
import com.grayMatter.entities.Person;

@Service
public class PersonServiceImpl implements PersonServiceInterface {
	
	@Autowired
	PersonDao dao;
	//instead use @requiredallargsconstructor lombok and use private final PersonDao dao;

	@Override
	public ResponseEntity<?>getAllPersons() {
		
		return dao.getAllPersons();
	}
	@Override
	public ResponseEntity<?> addPerson(Person person) {
		
		return dao.addPerson(person);
	}
	@Override
	public Optional<Person> getById(long id) {
		
		return dao.getById(id);
	}
	@Override
	public void deletePerson(long id) {
		dao.deletePerson(id);
		
	}
	@Override
	public Person updatePerson(Person p) {
		
		return dao.updatePerson(p);
	}

	
	

}
