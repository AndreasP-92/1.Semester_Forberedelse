package Løkker02;

import java.util.*;

public class TestProgram02 {
    public static void main(String[] args){
        Random r = new Random();

/*        int i = 2;

        do{
            System.out.println(i);

            i++;
        }while(i < 6);

        System.out.println("You've got " +i +" strokes!");*/

        int dice = r.nextInt(6)+1;
        int strokes = 0;

        while(dice != 6){
            strokes++;
            System.out.println("You rolled " + dice);
            dice = r.nextInt(6)+1;
        }
        if(dice == 6){
            System.out.println("Congratz, you've rolled a 6 in " + strokes + " strokes");
        }
    }
}
