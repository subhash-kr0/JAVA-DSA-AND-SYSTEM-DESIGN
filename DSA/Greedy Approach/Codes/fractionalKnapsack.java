import java.lang.*;
import java.util.Arrays;
import java.util.Comparator;
 
// Greedy approach
public class fractionalKnapsack {
     
    // Function to get maximum value
    private static double getMaxValue(ItemValue[] arr,
                                      int capacity)
    {
        // 1. Sorting items by profit/weight ratio;
        Arrays.sort(arr, new Comparator<ItemValue>() {
            @Override
            public int compare(ItemValue item1,
                               ItemValue item2)
            {
                double cpr1 = Double.valueOf(item1.profit/item1.weight);
                double cpr2 = Double.valueOf(item2.profit/item2.weight);
     
                if (cpr1 < cpr2)
                    return 1;
                else
                    return -1;
            }
        });
 
        double totalValue = 0;
 
        for (ItemValue i : arr) {
 
            int curWt = (int)i.weight;
            int curProfit = (int)i.profit;
 
            if (capacity - curWt >= 0) {
 
                // This weight can be picked whole
                capacity = capacity - curWt;
                totalValue += curProfit;
            }
            else {
 
                // Item cant be picked whole
                double fraction
                    = ((double)capacity / (double)curWt);
                totalValue += (curProfit * fraction);
                capacity
                    = (int)(capacity - (curWt * fraction));
                break;
            }
        }
 
        return totalValue;
    }
 
    // Item value class
    static class ItemValue {
 
        int profit, weight;
 
        // Item value function
        public ItemValue(int profit, int wt)
        {
            this.weight = wt;
            this.profit = profit;
        }
    }
 
    // Driver code
    public static void main(String[] args)
    {
 
        ItemValue[] arr = { new ItemValue(25, 5),
                            new ItemValue(75, 10),
                            new ItemValue(100, 12),
                            new ItemValue(50, 4),
                            new ItemValue(45, 7),
                            new ItemValue(90, 9),
                            new ItemValue(30, 3)
                        };
 
        int capacity = 37;

        //function calling                
        double maxValue = getMaxValue(arr, capacity);
 
        // Function call
        System.out.println("Maximum Profit is: "+maxValue);
    }
}