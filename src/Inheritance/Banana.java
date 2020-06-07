package Inheritance;

public class Banana extends Fruit{
    @Override
    public void showFruitWeight() {
        super.showFruitWeight();
        System.out.print(" The fruit weight is in grams");
    }
}
