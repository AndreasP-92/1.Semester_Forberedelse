package Klasser03;

public class Broker {
    public static void main(String[] args){
        Car car1 = new Car(2011);
        Car car2 = new Car(2011);

        System.out.println(car1);

        if(car1.year == car2.year){
            System.out.println("These cars are equal");
        }else{
            System.out.println("These car are not equal");
        }
    }
}
