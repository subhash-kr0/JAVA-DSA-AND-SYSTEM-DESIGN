
import java.util.*;

class Rectangle
{
    float length;
    float breadth;
    float area;

    public void input()
    {
        System.out.println("Calculation of Rectangle app :");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter length of Rectangle");
        length=scan.nextFloat();
        System.out.println("Please enter breath of Rectangle");
        breadth=scan.nextFloat();

    }
    public  void compute()
    {
        area=length*breadth;
    }

    public void disp()
    {
        System.out.println("The area of Rectangle is : "+ area);
    }
}

class Square
{
    float length;
    float area;

    public void input()
    {
        System.out.println("Calculation of Square app :");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter length of Square");
        length=scan.nextFloat();
       

    }
    public  void compute()
    {
        area=length*length;
    }

    public void disp()
    {
        System.out.println("The area of Square is : "+ area);
    }
}

class Circle
{
    float radius;
    float area;

    public void input()
    {
        System.out.println("Calculation of Circle app :");
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter radius of corcle");
        radius=scan.nextFloat();
       

    }
    public  void compute()
    {
        area=3.14f* radius * radius;
    }

    public void disp()
    {
        System.out.println("The area of Circleis : "+ area);
    }
}

public class LaunchApp {
    public static void main(String[] args) {

        Rectangle rec=new Rectangle();
        rec.input();
        rec.compute();
        rec.disp();
        Square sq=new Square();
        sq.input();
        sq.compute();
        sq.disp();
        Circle c=new Circle();
        c.input();
        c.compute();
        c.disp();
        
    }
    
}
