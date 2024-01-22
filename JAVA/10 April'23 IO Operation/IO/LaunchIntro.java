
import java.io.*;
class Student
{
    private String name;
    private int age;
    private String city;

    public Student(String name, int age, String city) 
    {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // public String toString()
    // {
    //     return "Name : " + name + " | Age : " + age + " | City : " + city;
    // }

  
}

public class LaunchIntro 
{
    public static void main(String[] args) throws Exception
    {

        Student st1=new Student("Virat", 34, "Delhi");
        System.out.println(st1);

        Student st2=new Student("Sachin", 44, "Mumbai");

        System.out.println(st2);

        
       //jvm shut down
    }
    
}
