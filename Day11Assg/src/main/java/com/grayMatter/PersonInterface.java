package com.grayMatter;

import java.util.List;

public interface PersonInterface {
	public List<Person> GetAllPersonInfo();
	public Person getPersonById(int id);
	public Person addPerson(Person person);
	public Person updatePerson(Person person,int id);
	public Person deletePerson(int id);
}
