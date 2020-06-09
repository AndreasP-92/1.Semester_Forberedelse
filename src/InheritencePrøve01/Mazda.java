package InheritencePrøve01;

public class Mazda extends FourWheeler{
    public void test(){}

    @Override
    public void fourWheels(){
        super.fourWheels();
        System.out.println("plus two extra");
    }
}
