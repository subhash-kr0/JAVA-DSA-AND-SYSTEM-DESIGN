// time complexity: O(n^2)
// space complexity: O(1)

import java.util.*;
import java.io.*;

public class InsertionSort {
    // Implementation of insertion sort
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                // swap the elements between arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {20, 50, 25, 67, 79, 12, 15};
        //function calling
        insertionSort(arr);
        System.out.println("Sorted array is: ");
        System.out.println(Arrays.toString(arr));
    }
}
