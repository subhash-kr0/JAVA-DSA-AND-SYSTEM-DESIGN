public class printMultiples {
    public static void printMulti(int n, int k){
        if(k == 1){
            System.out.println(n);
            return;
        }
        printMulti(n, k-1);
        System.out.println(n * k);

    }
    public static void main(String[] args){
        printMulti(24, 5);
        System.out.println();
    }
    
}
