import java.io.*;
import java.util.*;

class hashMapFunctions {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        // functionality of the put() function
        hashmap.put(1, "Priya");
        hashmap.put(3, "Asha");
        hashmap.put(5, "Karan");
        hashmap.put(8, "Astha");

        System.out.println("HashMap of the given data is: "+hashmap);

        // functionality of the get() function
        String result = hashmap.get(3);
        System.out.println("Value for the given key is: "+result);

        // functionality of the containsKey() function
        System.out.println(hashmap.containsKey(2));

        // functionality of the remove() function
        hashmap.remove(1);
        System.out.println("Updated hashmap: "+hashmap);

        // iterating using the for loop
        for(Map.Entry<Integer, String> e: hashmap.entrySet()){
            System.out.println("Hashmap is: ");
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
