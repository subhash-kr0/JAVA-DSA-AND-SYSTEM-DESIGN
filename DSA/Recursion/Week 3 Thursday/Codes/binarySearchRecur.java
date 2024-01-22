// Binary Search implementation using recursion

import java.util.*;

public class binarySearchRecur {
    public static int binarySearch(int[] arr, int low, int high, int target){
        int result = -1;
        while(low <= high){
            int mid = low + (high - low)/2;

            // condition 1 - match
            if(arr[mid] == target){
                return mid;
            }

            // condition 2 - right side
            if(arr[mid] < target){
                // recursive call
                return binarySearch(arr, mid+1, high, target);
            }

            // condition 3 - left side
            else{
                // recursive call
                return binarySearch(arr, low, mid-1, target);
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {2, 4, 6, 8, 10, 12};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the target value: ");
        int target = sc.nextInt();

        // function calling
        int result = binarySearch(arr, 0, arr.length-1, target);
        if(result == -1){
            System.out.println("No target element found in an array");
        }
        else{
            System.out.println("The target index is: "+result);
        }
        

    }
    
}
