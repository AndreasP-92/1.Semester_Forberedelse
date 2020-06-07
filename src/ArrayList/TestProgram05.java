package ArrayList;

import java.util.ArrayList;

public class TestProgram05 {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(5);
        arr.add(66);
        arr.add(12);
        arr.add(87);
        arr.add(66);
        arr.add(56);
        arr.add(89);
        arr.add(66);

        int count = 0;

/*        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == 66){
                count++;
            }

        }*/
            if(arr.contains(89)){
                System.out.println("The number 89 are found");
                int index = arr.indexOf(89);
                arr.remove(index);
                System.out.println("89 deleted");
            }
            System.out.println(arr);
//            int b = arr;
    }
}
