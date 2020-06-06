package com.company;

public class Main {
    public int year;
    public int plusYear = 20;
    public int year(int year){
        this.year = year + 20;
        return year;
    }
    public boolean isAdult(){
        return true;
    }

    public static void main(String[] args) {
        double a = 17;
        int b = 0;

        Main obj = new Main();

       /* int yearObj = obj.year(2019);*/

        String word1 = "cat";
        String word2 = "dog";
        String word3 = "dog";
        String word4 = "dog";

        if( word2 == word3 && word2 == word4 && word4 == word3 ){
            System.out.println("They are equal");
        } else {
            System.out.println("Det er ikke sandt");
        }
        int number = 100;

  /*      if (number & number == true){
            System.out.println("100 is true");
        }*/

        if (obj.year(2019) > 0 && obj.isAdult() == true){
            System.out.println("True");
        }

	// write your code here
    }
}
