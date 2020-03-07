package com.company;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word to reverse:");
        String reverseWord = input.next();
        String reverse = " ";

        for (int i = reverseWord.length() - 1 ; i >= 0 ; i--) {
            reverse = reverse + reverseWord.charAt(i);
        }
        System.out.println(reverse);


    }
}
