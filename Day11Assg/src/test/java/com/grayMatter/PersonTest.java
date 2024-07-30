package com.grayMatter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class PersonTest {

    private App app;

    @Before
    public void setUp() {
        app = new App();
    }

    @Test
    public void testGetAllPersonInfo() throws ClassNotFoundException {
        List<Person> actualList = app.GetAllPersonInfo();
        assertNotNull(actualList);
        assertTrue("Person Data retrieved", actualList.size() > 0);
    }

    @Test
    public void testGetPersonById() {
        try {
            Person person = app.getPersonById(3);
            assertNotNull(person);
            assertEquals(3, person.getId());
            assertEquals("Kannan", person.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddPerson() {
        try {
            Person person = new Person("Opp", 199, 27, "2343478", "opp@gmail.com");
            Person addedPerson = app.addPerson(person);
            assertNotNull(addedPerson);
            assertEquals(person.getName(), addedPerson.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdatePerson() {
        try {
            Person person = new Person("Umman", 23, 24, "2345678901", "umman@gmail.com");
            Person updatedPerson = app.updatePerson(person, 1);
            assertNotNull(updatedPerson);
            assertEquals(person.getName(), updatedPerson.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeletePerson() {
        try {
            Person person = app.deletePerson(1999);
            assertNotNull(person);
            assertEquals(1999, person.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
