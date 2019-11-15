package com.md;

import com.md.number.PerfectNumber;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Animal Test ============================================================");
//        Animal animal1 = new Dog("Bolt", 13);
//        animal1.type();
//        System.out.println("Animal Details: name " + animal1.getName() + " weight " + animal1.getWeight());
//        animal1.sound();
//        Animal animal2 = new Cat("Garfield", 14);
//        animal2.type();
//        System.out.println("Animal Details: name " + animal2.getName() + " weight " + animal2.getWeight());
//        animal2.sound();
//        System.out.println("==========================================================================");

        for (int i = 0; i < 200; i++) {
            printIsPerfect(i);
        }

    }

    private static void printIsPerfect(int n) {
        boolean isPerfect = PerfectNumber.isPerfect(n);
        if (isPerfect) {
            System.out.println(n + " is Perfect");
        } else {
            System.out.println(n + " is not Perfect");
        }
    }
}
