// try finally 

import java.util.Scanner;
public class ExceptionDemo4
	{
	public static void main(String[] args)
	{
		int num=0;
		Scanner sc=new Scanner(System.in);

		try
		{
			num=sc.nextInt();
		}

		finally
		{
		sc.close();
		System.out.println("Resources Closed");
		}

		System.out.println(num);
		
	}
}

//Output1: 76
//         Resources Closed
//         76

// Output2: Navin
//          Resources Closed
//          Exception in thread "main" java.util.InputMismatchException
