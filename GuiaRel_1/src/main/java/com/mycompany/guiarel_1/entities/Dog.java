/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiarel_1.entities;

import com.mycompany.guiarel_1.entities.enumerations.DogBreeds;
import com.mycompany.guiarel_1.entities.enumerations.DogSize;

/**
 *
 * @author HP-G42
 */
public class Dog {
    private String name;
    private DogBreeds breed;
    private Integer age;
    private DogSize size;

    public Dog() {
    }

    public Dog(String name, DogBreeds breed, Integer age, DogSize size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(DogBreeds breed) {
        this.breed = breed;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSize(DogSize size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public DogBreeds getBreed() {
        return breed;
    }

    public Integer getAge() {
        return age;
    }

    public DogSize getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Dog´s name:" + name + ", breed:" + breed + ", age:" + age + ", size:" + size;
    }
    

     
         
     



         
 
         

 
         
 
}
