public class TilingProblem {
    public static int getWays(int n)
    {
        //base case
        if(n <= 3)
        {
            return n;
        }

        //recursive call
        return getWays(n-1) + getWays(n-2);
    }

    public static void main(String[] args) {
        System.out.println("For n=1, total ways = " + getWays(1));
        System.out.println("For n=2, total ways = " + getWays(2));
        System.out.println("For n=3, total ways = " + getWays(3));
        System.out.println("For n=4, total ways = " + getWays(4));
        System.out.println("For n=5, total ways = " + getWays(5));
    }
}
