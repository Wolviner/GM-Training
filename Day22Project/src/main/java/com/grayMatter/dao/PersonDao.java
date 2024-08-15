package com.grayMatter.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.grayMatter.entities.Person;
import com.grayMatter.repositories.PersonRepository;

@Repository
public class PersonDao {

	@Autowired
	PersonRepository repository;
	
	public ResponseEntity<?> getAllPersons(){
		List<Person> plist=repository.findAll();
		Map<String,Object> map=new HashMap<String ,Object>();
		
		if(!plist.isEmpty()) {
			map.put("status",10);
			map.put("data",plist);
			return new ResponseEntity<>(map,HttpStatus.OK);
		}
		else
		{
			map.put("status",20);
			map.put("data","List is empty");
			return new ResponseEntity<>(map,HttpStatus.NOT_FOUND);
		}
//		return repository.findAll();
		}
	
	public ResponseEntity<?> addPerson(Person person) {
		Map<String,Object> map=new HashMap<String ,Object>();
		Person p=repository.save(person);
		if(p!=null)
		{
			map.put("status",11);
			map.put("data",p);
			return new ResponseEntity<>(map,HttpStatus.CREATED);
		}
		else
		{
			map.put("status",21);
			map.put("data","Record not added");
			return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
		}
		
		}
	public Optional<Person> getById(long id) {
		return repository.findById(id);
	}
	public void deletePerson(long aadharnum) {
		repository.deleteById(aadharnum);
	}
	public Person updatePerson(Person peo) {
		Person p=repository.findById(peo.getAadharNum()).get();
		p.setName(peo.getName());
		p.setMobileNum(peo.getMobileNum());
		p.setAge(peo.getAge());
		p.setEmail(peo.getEmail());
		return repository.save(p);
	}
	
}
