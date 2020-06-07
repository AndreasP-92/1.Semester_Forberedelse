package Klasser03;

public class Car implements Vehicle {
    public String name;
    public String model;
    public String color;
    public int year;

    public Car (int year){
        this.year = year;
    }
   @Override
    public String toString(){
        return "År: " + year;
    }
    @Override
    public void letsHunk(){
        System.out.println("HOOONK");
    }
}
