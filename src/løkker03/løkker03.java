package løkker03;

import java.util.Scanner;
import java.util.Random;

public class løkker03 {
    public static void main(String[] args){
        int i = 1;
        int j = 1;

        /*do{
            System.out.println(i * 10);
            i++;
        }while(i < 11);*/
//        do{
//            System.out.println("j++" + j++);
//            System.out.println("2* i ===="+2* i);
//            System.out.println("3* i ===="+3* i);
//            System.out.println("4* i ===="+4* i);
//            System.out.println("5* i ===="+5* i);
//        }while(i < 5 && j < 6);
        Scanner sc  = new Scanner(System.in);
        Random rand = new Random();

        int rnumber = rand.nextInt(10)+1;
        int rightNumber;
        int number = 0;

        System.out.println("Indtast et nummer mellem 1 - 10, og se om du får rigtigt");

        int guessedNumber = sc.nextInt();


        do{
            System.out.println("Løkke");
            number++;
            System.out.println(number);
        }while(number < rnumber);
        System.out.println("Number ====" + number);

        rightNumber = number;


        if (rightNumber == guessedNumber){
            System.out.println("Du var heldig, det rigtige nummer var: " + rightNumber);
        } else {
            System.out.println("Desværre, " + "Du har indtastet: " + guessedNumber + ", det rigtige nummer var: " + rightNumber);
        }

    }
}
