// What is the recurrence relation of below code
// What is the time complexity and space complexity of the below code

import java.util.*;
public class sumOfDigits {
	public static int sumDigit(int num) {
        // base case condition
		if(num == 0) 
			return 0;
		else 
            // recursive function call
			return num%10+sumDigit(num/10);
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		System.out.println("The sum of the digits is: "+sumDigit(n));
	}

}
