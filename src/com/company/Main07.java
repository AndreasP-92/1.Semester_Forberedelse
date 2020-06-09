package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main07 {
    public static void main(String[] args){
        int i = 1;

//        do{
//            System.out.println(i *10);
//            i++;
//        }while(i <=10);

//        do{
//            System.out.println("gange 2: "+ i * 1);
//            System.out.println("gange 2: "+ i * 2);
//            System.out.println("gange 3: "+i * 3);
//            System.out.println("gange 4: "+i * 4);
//            System.out.println("gange 5: "+i * 5);
//            i++;
//
//        }while(i <= 5);

        Scanner sc = new Scanner(System.in);

        Random rand = new Random();

        int number = rand.nextInt(10)+1;

        System.out.println("Guess a number between 1-10");

        int guessedNumber = sc.nextInt();

        int numberr = 0;

        int rNumber;

        do{
            numberr++;
        }while(numberr < number);

        System.out.println(numberr);

        if(numberr == guessedNumber){
            System.out.println("You've guessedd the right number, the right number was " + numberr);
        }else if(numberr != guessedNumber){
            System.out.println("Unfortunatley wrong number, the number was " + numberr);
        }

    }
}
