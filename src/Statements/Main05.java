package Statements;

public class Main05 {
    public String word1 = "cat";
    public String word2 = "dog";
    public int a = 10;
    public int b = 7;



    public static void main(String[] args){

        Main05 obj = new Main05();
        int aObj = obj.a;

        if ( obj.a > 5 ){

        }



    }
    public void test (){
        if(a +b > 3 ||a != b ){
            System.out.println("Expression 1");
        }else if( a == b || b > 1000){
            System.out.println("Expression 2");
        }

    }
    public void test03(){
        if (word1 == word2){
            System.out.println("They are equal");
        }
    }
    public void test02(){
        if(a + b > 3 && isAdult() == true ){
            System.out.println("This is an adult");
        }
    }
    public boolean isAdult (){
        return true;
    }
}
