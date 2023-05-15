/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiarel_1.entities;

/**
 *
 * @author HP-G42
 */
public class Person {
    private String name;
    private String lastName;
    private int age;
    private long id;
    private Dog dog;

    public Person() {
    }

    public Person(String name, String lastName, int age, long id, Dog dog) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.dog = dog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public long getId() {
        return id;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "name:" + name + ", lastName: " + lastName + ", age: " + age + ", id: " + id + "\n"+ dog;
    }
    
}
