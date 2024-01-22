// time complexity: O(logN)
// space complexity: O(1)
import java.util.*;
import java.io.*;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low=0, high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // size of an element from the user
        System.out.println("Enter the number of elements present in an array");
        int n = sc.nextInt();

        // array elements entered from the user
        System.out.println("Enter the array elements");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // target element from the user
        System.out.println("Enter target element");
        int x = sc.nextInt();

        // Function calling of binarySearch
        int result = binarySearch(arr, x);

        if(result == 0){
            System.out.println("Searched element is not found in an array");
        }
        else{
            System.out.println("Searched element is found at the location:" +result);
        }

    }
}
