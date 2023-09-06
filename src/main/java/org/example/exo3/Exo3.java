package org.example.exo3;

import java.util.Arrays;
import java.util.Scanner;

public class Exo3 {
    public static void exo1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un chiffre : ");
        int number = scanner.nextInt();

        while (number != 0){
            if(number >= 50){
                System.out.println(50);
                number -= 50;
            } else if (number < 50 && number >= 20) {
                System.out.println(20);
                number -= 20;
            } else if(number < 20 && number >= 10){
                System.out.println(10);
                number -= 10;
            } else if (number < 10 && number >= 5) {
                System.out.println(5);
                number -= 5;
            } else if (number < 5 && number >= 2) {
                System.out.println(2);
                number -= 2;
            } else if (number < 2 && number >= 1) {
                System.out.println(1);
                number -= 1;
            }


        }

    }

    public static void exo2() {
        int[] notes = {1, 2, 3, 4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20 };
        int total = 0;

        for (int i = 0; i < notes.length; i++) {
            total += notes[i];
        }
        double moyenne = (total / notes.length);
        System.out.println("moyenne" + moyenne);
        System.out.println("max"+Arrays.stream(notes).max());
        System.out.println("min"+Arrays.stream(notes).min());
    }

    public static void exo3() {
        String[] value = {"D","E", "C", "A", "L", "A", "G", "E"};
        String result = "";



        for (int i = (value.length - 1); i >= 0 ; i--) {
            result = result.concat(value[i]);
        }


        System.out.println(result);
    }
}
