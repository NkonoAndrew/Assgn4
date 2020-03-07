package com.company;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int fold1 = 1;
        int fold2 = 1;
        int fnew = 0;

        System.out.print("Enter the number: ");
        int fibonacci = input.nextInt();

        if (fibonacci == 1){
            System.out.println(1);
        }

        if (fibonacci == 2 ) {
            System.out.println(1 + " " + 1);
        }

        System.out.print(fold1 + " ");
        System.out.print(fold2 + " ");

        for(int i = 3; i <= fibonacci; i++)
        {
            //After that, discard fold2, which is no longer needed,
            // and set fold2 to fold1 and fold1 to fnew.
            // Repeat an appropriate number of times
            fnew = fold1 + fold2;
            System.out.print(fnew + " ");
            fold1 = fold2;
            fold2 = fnew;
        }

        System.out.println();


    }




}


