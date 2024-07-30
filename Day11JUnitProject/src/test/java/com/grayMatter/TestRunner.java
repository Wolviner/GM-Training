package com.grayMatter;
import org.junit.runners.Suite.*;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.*;
//import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
@SuiteClasses({AppTest.class,DemoTest.class})
@IncludeCategory(MarkerInterface.class)
@RunWith(Categories.class)
public class TestRunner {

}

//Create employee class, perform CRUD operations on it.
//create,red,update,delete
//Person{
//	int id;
//	String name;
//	int age;
//	String mobile;
//	String email;
//}

//Interface:
//List<Person> GetAllPersonInfo()
//Person getPersonById(int id);
//Person addPerson(Person person)
//Person updatePerson(Person person,int id)
//Person deletePerson(int id)

//Create test cases for above apis;