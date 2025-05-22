package com.pluralsight;

import com.pluralsight.streams.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", "Johnson", 28));
        people.add(new Person("Bob", "Smith", 35));
        people.add(new Person("Carol", "Davis", 22));
        people.add(new Person("David", "Wilson", 40));
        people.add(new Person("Eva", "Brown", 31));
        people.add(new Person("Frank", "Miller", 27));
        people.add(new Person("Grace", "Moore", 29));
        people.add(new Person("Henry", "Taylor", 33));
        people.add(new Person("Ivy", "Anderson", 24));
        people.add(new Person("Jack", "Thomas", 38));

        Scanner scanner = new Scanner(System.in);

        // Search for names
        System.out.print("Enter a first or last name to search: ");
        String searchName = scanner.nextLine().trim();

        List<Person> matchedPeople = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
                    person.getLastName().equalsIgnoreCase(searchName)) {
                matchedPeople.add(person);
            }
        }

        if (matchedPeople.isEmpty()) {
            System.out.println("No people found with the name: " + searchName);
        } else {
            System.out.println("People matching the name '" + searchName + "':");
            for (Person p : matchedPeople) {
                System.out.println(p);
            }
        }

        //calculate the age
        if (!people.isEmpty()) {
            int sumAges = 0;
            int oldestAge = Integer.MIN_VALUE;
            int youngestAge = Integer.MAX_VALUE;

            for (Person person : people) {
                int age = person.getAge();
                sumAges += age;

                if (age > oldestAge) {
                    oldestAge = age;
                }
                if (age < youngestAge) {
                    youngestAge = age;
                }
            }

            double averageAge = (double) sumAges / people.size();

            System.out.printf("Average age: %.2f%n", averageAge);
            System.out.println("Oldest age: " + oldestAge);
            System.out.println("Youngest age: " + youngestAge);
        } else {
            System.out.println("The people list is empty.");
        }

        scanner.close();
    }
}


