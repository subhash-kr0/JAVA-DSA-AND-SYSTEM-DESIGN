@FunctionalInterface
interface Car
{ 
	void drive();
}
public class LambdaDemo{
	public static void main(String args[]){
		Car obj=()->System.out.println("Driving...");

		obj.drive();
	}
} 