package com.AssignmentPerson;

public class Person {
    private String name;
    private int age;
    private String city;
    private String aadhar;

    public Person(String name, int age, String city, String aadhar) throws AgeNotSufficientException {
        if (age < 18) {
            throw new AgeNotSufficientException("Age is not sufficient for voting");
        }
        this.name = name;
        this.age = age;
        this.city = city;
        this.aadhar = aadhar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", city=" + city + ", aadhar=" + aadhar + "]";
    }
}
