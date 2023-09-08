package org.example;

import org.example.Exo2.Exo2;
import org.example.exo4.Exo4;
import org.example.exo5.Chaise;
import org.example.exo7.Person;
import org.example.exo7.Student;
import org.example.exo7.Teacher;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Exo4.exo3();
//        Chaise chaise1 = new Chaise(4, "Bleu", "Bois");
//        Chaise chaise2 = new Chaise(4, "Blanche", "Métal");
//        Chaise chaise3 = new Chaise(1, "Transparente", "Pléxiglass");
//
//        System.out.println(chaise1.toString());
//        System.out.println(chaise2.toString());
//        System.out.println(chaise3.toString());
        Person perso = new Person();
        perso.hello();
        Student student = new Student();
        student.setAges(15);
        student.hello();
        student.goToClasses();
        student.displayAge();
        Teacher teacher = new Teacher();
        teacher.setAges(40);
        teacher.hello();
        teacher.Explain();
//
//        // Press Maj+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Maj+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
//        }
    }
}