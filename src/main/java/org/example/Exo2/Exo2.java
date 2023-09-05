package org.example.Exo2;

import java.util.Scanner;

public class Exo2 {
    public static void exercise1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un age : ");
        int number = scanner.nextInt();

        if(number == 6 || number == 7){
            System.out.println("c'est un poussin");
        } else if (number == 8 || number == 9) {
            System.out.println("c'est un pupille");
        } else if (number == 10 || number == 11) {
            System.out.println("c'est une Minime");
        } else if (number >= 12) {
            System.out.println("c'est un cadet");
        }

    }
    public static void exercise2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un chiffre : ");
        Integer number = scanner.nextInt();

        if(number % 3 == 0){
            System.out.println("c'est divible part 3");
        }else {
            System.out.println("c'est pas divisible part 3");
        }

    }
    public static void exercise3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un chiffre : ");
        int number = scanner.nextInt();

        if (number < 10) {
            System.out.println("15 cents");
        } else if (number <= 10 && number > 20){
            System.out.println("10 cents");
        } else if (number >= 20) {
            System.out.println("5 cents");
        } else {
            System.out.println("error");
        }
    }
    public static void exercise4() {

    }
    public static void exercise5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un chiffre : ");
        int number = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int res = number * i;
            System.out.println(number+ " * "+ i+ " = "+ res);
        }
    }
    public static void exercise6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un chiffre : ");
        int number = scanner.nextInt();
        int res = 0;

        for (int i = 1; i <= number; i++) {
             res += i;
        }
        System.out.println(res);
    }
}
