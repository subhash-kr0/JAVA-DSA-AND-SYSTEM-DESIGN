public class Heap {
    static int size = 0;
    static int[] heap = new int[100];
    
    public static void insert(int x){
        size++;
        heap[size-1] = x;
        int i = size-1;
        while(i>0 && heap[(i-1)/2] > heap[i] ){
            swap( (i-1)/2 , i );
            i = (i-1)/2 ; 
        }
    }
    public static int delete(){
        int popped = heap[0];
        heap[0] = heap[size-1];
        size--;
        int i =0;
        while(i < (size-1)/2){
            if(heap[i]>heap[2*i +1] || heap[i]>heap[2*i+2]){
                int minimum =(heap[2*i+1] < heap[2*i +2]) ? 2*i+1 :2*i +2 ;
                swap(i,minimum);
            }
        }
        return popped;
        
    }
    public static int getMin(){
        return heap[0];
    }
    public static void print(){
        for(int i=0 ; i<size ; i++){
            System.out.print(heap[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int a , int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] =temp;
    }
    public static void main(String[] args) {
        insert(10);
        insert(8);
        insert(6);
        print();
        insert(7);
        print();
        System.out.println("Min element :"+getMin());
        System.out.println("Deleted element:"+delete());
        print();
        System.out.println("Deleted element is:"+delete());
        print();
        System.out.println("Min element :"+getMin());
        
    }
}