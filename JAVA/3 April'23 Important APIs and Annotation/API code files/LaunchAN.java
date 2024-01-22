

//functional interface
@FunctionalInterface
interface Demo
{
    void disp();
    //void disp2();
}

//this is parent class 

@Deprecated
class Plane
{
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Plane is flying");
    }
   
}

//this is child class or subclass
class CargoPlane extends Plane
{
    //overriden method from parent class
    @Override
    public void planeFliesAtGoodHeight()
    {
        System.out.println("cargoplane flies low");

    }
    
}

public class LaunchAn 
{
    public static void main(String[] args) 
    {
       //object of child classa
        Plane cp=new CargoPlane();
        cp.planeFliesAtGoodHeight();
       

        
    }
    
}
