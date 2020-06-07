package Array;

import java.util.*;

public class TestProgram04 {
    public static void main(String[] args){
        int[] a = {11, 2233, 44, 55, 66, 88, 99};

        int sum = a[0] + a[1] + a[2] + a[3] + a[4] + a[5] + a[6];
        int averge = sum / 7;

        a[0] = 99;
        a[6] = 11;

        System.out.println(averge);
        System.out.println(a[0]);
        System.out.println(a[6]);

        int[] b = a;

        System.out.println(Arrays.toString(b));
    }
}
