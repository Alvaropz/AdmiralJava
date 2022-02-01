package com.sparta.oop;

public abstract class Person {
    // ALL instance variables should be private, never public **possibly** protected
    // default or package access - avoid using this
    private String fn = "dummy"; // default null unless assigned like this
    private String lastName; // default null

    public Person(String firstName, String lastName) {
        this.fn = firstName;
        this.lastName = lastName;
    }


    public Person() {

    }
    public abstract void delete(); // no implementation for this abstract method

    public String getFirstName() {
        return fn;
    }

    public void setFirstName(String firstName) {
        fn = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName(){
        return fn + " " + lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + fn + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
