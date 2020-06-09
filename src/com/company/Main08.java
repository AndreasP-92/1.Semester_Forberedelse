package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main08 {

    public static void main(String[] args){
        int i = 0;

        do{
            System.out.println(i*10);
            i++;
        }while(i <= 10);

        int j = 0;

        do{
            System.out.println(i*1);
            System.out.println(i*2);
            System.out.println(i*3);
            System.out.println(i*4);
            System.out.println(i*5);
            j++;
        }while(j <= 10);

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Guess a number between 1-10");

        int guessedNumber = sc.nextInt();

        int rightNumber = 0;

        int number = rand.nextInt(6)+1;

        do{
            rightNumber ++;
        }while(rightNumber < number);

        if(guessedNumber == rightNumber){
            System.out.println("You've guessed the right number, the number were" + rightNumber);
        }else if(guessedNumber != rightNumber){
            System.out.println("You've guessed number " + guessedNumber +" WRONG!! The right number were " + rightNumber);
        }

    }
}
