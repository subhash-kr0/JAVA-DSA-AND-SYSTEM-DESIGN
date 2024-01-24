import java.util.*;

public class slidingWindow {
    public static int[] maxSlidingWindow(int[] a, int k) {
        int n = a.length;
        int[] r = new int[n-k+1];
        int ri = 0;
        // store index
        Deque<Integer> q = new ArrayDeque<>();
        
        for (int i = 0; i < a.length; i++) {
            // remove numbers out of range k
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            // remove smaller numbers in k range as they are useless
            while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
                q.pollLast();
            }
            // q contains index... r contains content
            q.offer(i);
            if (i >= k - 1) {
                r[ri++] = a[q.peek()];
            }
        }
        return r;
    }
   
        
        public static void main(String args[]){
            int []arr = {1, 3, -1, -3, 5, 3, 6, 7};
            int n = 8;
            int k = 3;
            int[] res = new int[n-k+1];
            res = maxSlidingWindow(arr , k);
            
            System.out.println("The desired output is : ");
            
            for(int i=0;i<n-k+1;i++){
                System.out.print(res[i] + "  ");
            }
                
    }
    
}
