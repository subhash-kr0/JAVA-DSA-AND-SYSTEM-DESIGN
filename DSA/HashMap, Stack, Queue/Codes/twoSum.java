// time complexity: O(n)
// space complexity: O(n)
import java.util.*;

public class twoSum {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int n = sc.nextInt();

    // input array elements in an array
    int[] arr = new int[n];
    System.out.println("Enter the array elements");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }

    // input target element in an array
    System.out.println("Enter the target element in an array");
    int target = sc.nextInt();

    // Create a hashmap where key is arr[i] and value is i
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i=0; i<n; i++){
        map.put(arr[i], i);
    }
    // create a result array to display the index of two numbers
    int result[] = new int[2];

    // if current is equal to the target
    for(int i=0; i<n; i++){
        if(arr[i] == target && map.containsKey(0)){
            result[0] = i;
            result[1] = map.get(0);
            break;
        }

        else if(map.containsKey(target - arr[i])){
            // is the element non-repeatable
            if(map.get(target - arr[i]) > i){
                result[0] = i;
                result[1] = map.get(target - arr[i]);
                break;
            }
        }
    }

    System.out.println("Two Sum index values are: ["+result[0]+","+result[1]+"]");

  }
}
