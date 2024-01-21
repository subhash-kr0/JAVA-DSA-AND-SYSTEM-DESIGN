class Calc
{
	public int add(int n1, int n2)
	{
		int result=n1+n2;
		return result;
	}
	public int add(int n1, int n2,int n3)
	{
		int result=n1+n2+n3;
		return result;
	}
	public int add(double n1, double n2)
	{
		int result=n1+n2;
		return result;
	}
	

}

public class Demo3{
public static void main(String[] agrs){

	Calc obj=new Calc();
	int result=obj.add(4,3)
	int res1=obj.add(4,3,2);
	System.out.println(result);
	System.out.println(res1);
	}
}