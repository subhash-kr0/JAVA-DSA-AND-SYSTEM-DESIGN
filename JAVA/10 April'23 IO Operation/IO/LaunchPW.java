
import java.io.*;
public class LaunchPW 
{
    public static void main(String[] args) throws Exception
    {
        File dir=new File("PW");
        File file=new File(dir, "pw.txt");

        
        FileWriter fw=new FileWriter(file);
        PrintWriter pw=new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("Java");
        pw.print(100);
        pw.println('a');
        pw.println(50.5);
        pw.println(true);

        pw.close();
    
    }
    
}
