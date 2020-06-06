package klasser02;

public class Intel implements Computer {
    String x;
    String CPU;

    @Override
    public void showCPU(){
        CPU = "I10";
        System.out.println("CPU: "+CPU);
    }

    @Override
    public void showComputerName(String x){
        System.out.println("Lenovo");
    }

}
