package org.example.exo7;

public class Student extends Person{

    public void goToClasses() {
        System.out.println("I’m going to class");
    }

    public void displayAge(){
        System.out.println("My age is: "+getAges()+" years old");
    }
}
