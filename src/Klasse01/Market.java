package Klasse01;

public class Market {
    public static void main (String[] args){
        Apple a = new Apple(22, "red apple", 0.5);
        Apple b = new Apple( 50, "green apple" , 0.2);

        if(a.price == b.price){
            System.out.println("the prices are equal");
        }
        if(a.name == b.name){
            System.out.println("The names are equal");
        }
        a.showData();
    }
}
