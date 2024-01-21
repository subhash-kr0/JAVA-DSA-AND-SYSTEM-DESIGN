class Calc
{
 	public int add(int x,int y)
	{
		int result=x+y;
		return result;
	}
}


public class Demo3{
	public static void main(String[] args){

	Calc obj= new Calc();
	int result=obj.add(5,2);
	System.out.println(result);
	}
}





