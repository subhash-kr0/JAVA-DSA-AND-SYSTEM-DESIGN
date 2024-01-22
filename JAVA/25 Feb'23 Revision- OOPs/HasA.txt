

class Car
{
   private Engine eng;

//    public Car(Engine eng)
//    {
//     this.eng=eng;
//    }
   public void setEng(Engine eng)
   {
    this.eng=eng;
   }


   public void start()
   {
     eng.engineStart();
   }
}


class Engine
{

    public void engineStart()
    {
        System.out.println("Car started");
    }

}






// class Student
// {
//     private Heart h;
//     public Student(Heart h)
//     {
//         this.h=h;
//     }
//     public void setH(Heart h)
//     {
//         this.h=h;
//     }

//     public void call()
//     {
//         h.heartBeatr();
//     }
// }
// class Heart
// {

//     public void heartBeatr()
//     {
//         System.out.println("Heart is important");
//     }
// }


public class HasA 
{
    public static void main(String[] args) 
    {
        // Heart h=new Heart();

        // Student s=new Student(h);
        // s.setH(h);
        Engine e=new Engine();

    

        Car c=new Car();

        c.setEng(e);

       
        c.start();

        
    }
    
}
