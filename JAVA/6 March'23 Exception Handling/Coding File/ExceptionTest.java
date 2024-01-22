// Checked and Unchecked Exception

public class ExceptionTest
{
	public static void main(String[] args)
	{
		int result = 7/0;
		System.out.println(result);
	}
}



// Output: Exception in thread "main" java.lang.ArithmeticException: / by zero 
//           at ExceptionTest.main(ExceptionTest.java:7)