
import java.io.*;
class Cricketer1 implements Serializable
{
     String name;
    transient int age;
     int runs;

    public Cricketer1(String name, int age, int runs)
    {
        this.name=name;
        this.age=age;
        this.runs=runs;

    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(runs);
    }
   
    
}
public class LaunchSSD 
{
    public static void main(String[] args) throws Exception
    {
        // Cricketer1 c=new Cricketer1("Sachin", 44, 30000);
        // c.disp();

        // FileOutputStream fos=new FileOutputStream("pw.txt");
        // BufferedOutputStream bos=new BufferedOutputStream(fos);
        // ObjectOutputStream oos=new ObjectOutputStream(bos);

        // oos.writeObject(c);

        // oos.flush();
        // oos.close();

        FileInputStream fis=new FileInputStream("pw.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        ObjectInputStream ois=new ObjectInputStream(bis);

        Cricketer1 cr=(Cricketer1)ois.readObject();
        cr.disp();




        
    }
    
}
