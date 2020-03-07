package com.company;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        java.util.Random randomNumber = new java.util.Random(1000);

        for (int i = 1; i <= 50 ; i++) {
            int rand1 = randomNumber.nextInt(100);
            System.out.print(rand1 + " ");

        }

    }
}
