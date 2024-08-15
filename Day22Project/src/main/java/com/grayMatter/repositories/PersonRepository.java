package com.grayMatter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grayMatter.entities.Person;


public interface PersonRepository extends JpaRepository<Person,Long> {

}
