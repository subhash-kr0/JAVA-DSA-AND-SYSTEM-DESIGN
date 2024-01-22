
import java.util.Scanner;
public class ExceptionDemo3
	{
	public static void main(String[] args)
	{
		int num=0;
		Scanner sc=new Scanner(System.in);

		try
		{
			num=sc.nextInt();
		}

		catch(InputMismatchException e)
		{
			System.out.println("Please enter number");
		}
		sc.close();
	
		System.out.println(num);
		
	}
}

// Output1: javac ExceptionDemo3.java			
//	      java ExceptionDemo3
//          78
//          78


// Output2:			
//	      java ExceptionDemo3
//          Navin
//          Please enter number
//	      0