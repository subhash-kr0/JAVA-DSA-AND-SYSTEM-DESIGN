import java.util.*;

public class dequeImp{
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(5);
        deque.addLast(7);
        deque.addLast(9);
       
        System.out.println("Deque output looks like: "+deque);

        deque.removeFirst();
        System.out.println("Deque output looks like after deletion: "+deque);
    }
}