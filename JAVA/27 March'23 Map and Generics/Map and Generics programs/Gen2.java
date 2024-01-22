
import java.util.*;
class Student1
{
    private String name;
    private int id;

}
class Employee1
{
    private String name;
    private int id;

}

public class Gen2 
{
    public static void main(String[] args) 
    {

        Student1 st1=new Student1();
        Student1 st2=new Student1();

        Employee1 e=new Employee1();

        ArrayList<Student1> al=new ArrayList<Student1>();
        al.add(st1);
        al.add(st2);
        //al.add(e);
       

        
    }
    
}
