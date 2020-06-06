package com.company;
import java.util.Scanner;

public class Main02 {
    public static void main (String[] args){
        int i = 1;
        do {
            System.out.println("do / while loop " + i * 10);
            i++;
        } while (i <= 10);

        System.out.println("______________________________");

        for (int j = 1; j <= 5; j++) {
            System.out.println(j);
        }

        System.out.println("____________________________");

        for (int k = 1; k <= 5; k++) {
            System.out.println(k * 2);
        }
        System.out.println("____________________________");

        for (int l = 1; l <= 5; l++) {
            System.out.println(l * 3);
        }

        System.out.println("____________________________");

        for (int m = 1; m <= 5; m++) {
            System.out.println(m * 4);

        }

        System.out.println("____________________________");

        for (int n = 1; n <= 5; n++) {
            System.out.println(n * 4);
        }

        System.out.println("____________________________");

        for (int o = 1; o <= 5; o++) {
            System.out.println(o * 5);
        }

        System.out.println("____________________________");


        Scanner kb = new Scanner(System.in);
        System.out.println("Enter A Number 1-10. Guess the Right Number And You Win");

        int myNum = 8;
        boolean a = myNum == 8;

        if (a) {
            int number = kb.nextInt();
            System.out.println("You Guessed The Right Number Congratz!!!*** " + myNum);
        } else {
            System.out.println("Sorry Incorrect Number");
        }

    }
}
