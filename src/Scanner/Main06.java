package Scanner;

import java.util.Scanner;
import java.io.File;
public class Main06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = sc.nextInt();

        try{
            System.out.println("Your age are "+age);
        }catch(Exception e){
            System.out.println("Forkert indtastning");
        }

        try{
            String fileName = "./asdasd";
            File imports = new File(fileName);
        }catch(Exception e){
            System.out.println("File not found");
        }


    }
}
