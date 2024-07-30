package com.grayMatter;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class App implements PersonInterface {

    @Override
    public List<Person> GetAllPersonInfo() {
        List<Person> persons = new ArrayList<>();
        String query = "SELECT * FROM Persons";
        try (Connection con = PersonDriver.getConnection();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                persons.add(new Person(
                    rs.getString("ename"),
                    rs.getInt("id"),
                    rs.getInt("age"),
                    rs.getString("mobile"),
                    rs.getString("mail")
                ));
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return persons;
    }

    @Override
    public Person getPersonById(int id) {
        String query = "SELECT * FROM Persons WHERE id = ?";
        try (Connection con = PersonDriver.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Person(
                        rs.getString("ename"),
                        rs.getInt("id"),
                        rs.getInt("age"),
                        rs.getString("mobile"),
                        rs.getString("mail")
                    );
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Person addPerson(Person person) {
        String query = "INSERT INTO Persons (id, ename, age, mobile, mail) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = PersonDriver.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, person.getId());
            ps.setString(2, person.getName());
            ps.setInt(3, person.getAge());
            ps.setString(4, person.getMobile());
            ps.setString(5, person.getEmail());
            ps.executeUpdate();
            return getPersonById(person.getId());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Person updatePerson(Person person, int id) {
        String query = "UPDATE Persons SET ename = ?, age = ?, mobile = ?, mail = ? WHERE id = ?";
        try (Connection con = PersonDriver.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, person.getName());
            ps.setInt(2, person.getAge());
            ps.setString(3, person.getMobile());
            ps.setString(4, person.getEmail());
            ps.setInt(5, id);
            ps.executeUpdate();
            return getPersonById(id);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Person deletePerson(int id) {
        Person person = getPersonById(id);
        String query = "DELETE FROM Persons WHERE id = ?";
        try (Connection con = PersonDriver.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return person;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
