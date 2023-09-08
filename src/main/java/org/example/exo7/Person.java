package org.example.exo7;

public class Person {
    private int ages;

    public void setAges(int ages) {
        System.out.println(ages + "years old");
        this.ages = ages;
    }

    public int getAges() {
        return ages;
    }

    public void hello(){
        System.out.println("Hello");
    }
}
