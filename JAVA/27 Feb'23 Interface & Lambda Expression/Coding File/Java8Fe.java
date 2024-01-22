interface A 
{
    void show();
    default void config()
    {
        System.out.println("in config");
    }
    static void abc()
    {
        System.out.println("in abc");
    }
}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
}

public class Java8Fe {
    public static void main(String[] args) {
        A.abc();
        A obj = new B();
        obj.config();
    }
}
