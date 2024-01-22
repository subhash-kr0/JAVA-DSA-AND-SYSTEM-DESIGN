@FunctionalInterface
interface Car
{
    void drive(int avg, int topSpeed);
}


public class AnnoyDemo {
    public static void main(String[] args) {
        Car obj = (avg, ts) -> System.out.println("Running with avg " + avg);
          
    
        obj.drive(16, 140);

       
    }
}
