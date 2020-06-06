package Inheritance02;

public class Mazada extends FourWheeler{

    @Override
    public void numberOfWheels() {
        super.numberOfWheels();
        System.out.println("Plus two extra");
    }
}
