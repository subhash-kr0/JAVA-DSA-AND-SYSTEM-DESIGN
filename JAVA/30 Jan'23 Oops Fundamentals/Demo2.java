class Calc
{
	public void show(byte num)
	{
		System.out.println("byte" +num);
	}
	public void show(short num)
	{
		System.out.println("short" +num);
	}
	public void show(char num)
	{
		System.out.println("char" +num);
	}
	public void show(int num)
	{
		System.out.println("int" +num);
	}
	public void show(double num)
	{
		System.out.println("double" +num);
	}
}

public class Demo2{
public static void main(String[] agrs){

	Calc obj=new Calc();
	byte b=5;
	obj.show(b);
	}
}