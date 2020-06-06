package Inheritance03;

public class Circle extends Shape{
/*

    @Override
    public double getPerimeter() {
        return super.getPerimeter();

    }
*/
    public double r = 22;

     @Override
    public double getPerimeter(){

         return super.getPerimeter();

    }
    @Override
    public double getArea(){
         System.out.println("The area is"+ 3.14 * r * r);
         return super.getArea();
    }
}
