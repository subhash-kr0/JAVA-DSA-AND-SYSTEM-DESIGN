
import java.io.*;

public class LaunchFile1 
{
    public static void main(String[] args) throws IOException
    {
        
        // File file1=new File("pw.txt");

        // System.out.println(file1.exists());//false

        // file1.createNewFile();
        // System.out.println(file1.exists());// true


        File dir=new File("PW");
        System.out.println(dir.exists()); //false

        dir.mkdir();

        System.out.println(dir.exists()); //true
        
    }
    
}
