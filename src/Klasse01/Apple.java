package Klasse01;

public class Apple implements Fruit {
    int price;
    String name;
    double weight;

    public Apple (int price, String name, double weight){
        this.price  = price;
        this.name   = name;
        this.weight = weight;
    }

    @Override
    public void showData() {
        System.out.println("This fruit has the following data: " + "\nCategory: "+ category + " - Name: " + name + " - Price: "+ price + " - Weight: " + weight);
    }
    //public void showData(){

    //}
}
