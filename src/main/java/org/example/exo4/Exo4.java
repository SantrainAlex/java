package org.example.exo4;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exo4 {
    public static void exo1() {
        String myStr = "alexis santrain 26 ans";

        String[] words = myStr.split("\\s+");
        System.out.println(words.length);
    }

    public static void exo2() {
        String myStr = "alexis";
        System.out.println(myStr.length());
    }

    public static void exo3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un mot : ");
        String myStr = scanner.next();
        System.out.println("Donne moi un deuxième mot : ");
        String myStr2 = scanner.next();

        Boolean valid = true;

        for (int i = 0; i < myStr2.length(); i++) {
            if (myStr.contains(myStr2.substring(i, (i+1)))){
                valid = true;

            }else {
                valid = false;

            }
        }
        if(valid){
            System.out.println("les mot sont des anagrammes ");
        }else {
            System.out.println("les mot ne sont pas anagramme ");
        }

    }
    public static void exo4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un mot : ");
        String myStr = scanner.next();
        String myStr2 = new StringBuilder(myStr).reverse().toString();

        if(myStr2.contains(myStr)){
            System.out.println("Les mot son Palindrome");
        }else {
            System.out.println("Les mot ne sont pas Palindrome");
        }
    }

    public static void exo5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donne moi un numéro : ");
        int num = scanner.nextInt();
        for (int i = 1; i < num; i++) {
            System.out.println(String.join("", Collections.nCopies(2 * i -1, "*")));
        }
        for (int i = num; i > 0; i--) {
            System.out.println(String.join("", Collections.nCopies(2 * i -1, "*")));

        }
    }

}
