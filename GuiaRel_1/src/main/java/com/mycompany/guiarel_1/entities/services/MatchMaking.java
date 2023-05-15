/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guiarel_1.entities.services;

import com.mycompany.guiarel_1.entities.Dog;
import com.mycompany.guiarel_1.entities.Person;
import com.mycompany.guiarel_1.entities.enumerations.DogBreeds;
import com.mycompany.guiarel_1.entities.enumerations.DogSize;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author HP-G42
 */
public class MatchMaking {

    Scanner sc = new Scanner(System.in, StandardCharsets.UTF_8).useDelimiter("\n");

    public void createDog(List<Dog> dogList) {
        char select;
        do {
            Dog dog = new Dog();
            System.out.println("Enter the dog´s name:");
            dog.setName(sc.next());
            System.out.println("Enter the dog´s age:");
            dog.setAge(sc.nextInt());
            int op;
            do {
                System.out.println("""
                       Choose the dog size:
                       1)Small
                       2)Medium
                       3)Large""");
                op = sc.nextInt();
                switch (op) {
                    case 1 -> {
                        dog.setSize(DogSize.SMALL);
                    }
                    case 2 -> {
                        dog.setSize(DogSize.MEDIUM);
                    }
                    case 3 -> {
                        dog.setSize(DogSize.LARGE);
                    }
                    default ->
                        System.out.println("Incorrect option. Please try again.");
                }
            } while (op < 1 || op > 3);
            do {
                System.out.println("""
                       Choose the dog´s breed:
                       1)Bulldog
                       2)German shepherd
                       3)Labrador retriever
                       4)Poodle
                       5)Siberian Husky       
                               """);
                op = sc.nextInt();
                switch (op) {
                    case 1 -> {
                        dog.setBreed(DogBreeds.BULLDOG);
                    }
                    case 2 -> {
                        dog.setBreed(DogBreeds.GERMAN_SHEPHERD);
                    }
                    case 3 -> {
                        dog.setBreed(DogBreeds.LABRADOR_RETRIEVER);
                    }
                    case 4 -> {
                        dog.setBreed(DogBreeds.POODLE);
                    }
                    case 5 -> {
                        dog.setBreed(DogBreeds.SIBERIAN_HUSKY);
                    }
                    default ->
                        System.out.println("Incorrect option. Please try again.");
                }
            } while (op < 1 || op > 5);
            dogList.add(dog);
            do {
                System.out.println("Do you want to continue adding dogs?(Y/N)");
                select = sc.next().toLowerCase().charAt(0);
                System.out.println((select != 'y' && select != 'n') ? "Incorrect option, try again" : "");
            } while (select != 'y' && select != 'n');
        } while (select == 'y');
    }

    public Person createPerson(Map<Long, Person> hashMap) {
        Person person = new Person();
        System.out.println("Enter your first name:");
        person.setName(sc.next());
        System.out.println("Enter your last name:");
        person.setLastName(sc.next());
        System.out.println("Enter your age:");
        person.setAge(sc.nextInt());
        System.out.println("Enter your ID:");
        person.setId(sc.nextInt());
        hashMap.put(person.getId(), person);
        return person;
    }

    public void mach(List<Dog> dogList, Person person) {
        int op;
        do {

            int count = 1;
            System.out.println("Choose a Dog:");
            for (Dog dog : dogList) {
                System.out.println(count + ")" + dog);
                count++;
            }

            op = sc.nextInt();
            System.out.println((op < 0 || op > dogList.size()) ? "Wrong option, please try again ;-)" : "Your new " + dogList.get(op - 1));
        } while (op < 0 || op > dogList.size());
        person.setDog(dogList.get(op - 1));
        dogList.remove(op - 1);
    }

    public void menu() {
        List<Dog> dogList = new ArrayList<Dog>();
        Map<Long, Person> hashMap = new HashMap<Long, Person>();
        Person person = new Person();
        int op;
        do {        
        System.out.println("-----------------*MENU*-------------------\n"
                + "1)Register to be able to adopt\n"
                + "2)Add a new dog in the adoption list\n"
                + "3)Choose your account from the list of users\n"
                + "4)Choose a dog\n"
                + "5)Display your data, whit the your dog information\n"
                + "6)Display all the users whit their dogs\n"
                + "6)Exit");
        op = sc.nextInt();
        switch (op) {
            case 1:
                person = createPerson(hashMap);
                break;
            case 2:
                createDog(dogList);
                break;
            case 3:
                System.out.println("Enter your ID:");
                long id = sc.nextLong();
                if (hashMap.containsKey(id)) {
                    person = hashMap.get(id);
                }
                break;
            case 4:
                mach(dogList, person);
                break;
            case 5:
                System.out.println(person);
                break;
            case 6:
                for (Map.Entry<Long, Person> entry : hashMap.entrySet()) {
                    System.out.println(entry.getValue().getName() + ", " + entry.getValue().getDog());
                }
                break;
            case 7:
                System.out.println("Good bye!");
                break;
            default:
                System.out.println("Incorrect option, try again :-D");
        }
    } while (op!=7);
    }
}
