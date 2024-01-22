

enum Result
{
    PASS, FAIL, NR;

    //public static final Result PASS=new Result();

     //public static final Result FAIL=new Result();

      //public static final Result NR=new Result();
    

    int marks;

    Result()
    {
        System.out.println("Constructor in Enum");
    }

    void setMarks(int marks)
    {
        this.marks=marks;

    }

    int getMarks()
    {
        return marks;
    }
}


public class LaunchEnum2 
{
    public static void main(String[] args) 
    {

        Result.PASS.setMarks(50);

        int m1=Result.PASS.getMarks();
        System.out.println(m1);//50

        int m2=Result.FAIL.getMarks();
        System.out.println(m2);//0


        Result.NR.setMarks(45);
        int m3=Result.NR.getMarks();
        System.out.println(m3);//45
          
        
    }
    
}
