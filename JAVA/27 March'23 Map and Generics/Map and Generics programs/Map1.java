

import java.util.*;

public class Map1 
{
    public static void main(String[] args) 
    {
        
        HashMap hm1=new HashMap();
       // hm1.put(null, null);
        hm1.put(02, "Rohit");//Entry
        hm1.put(03, "Rohan");
        hm1.put(04, "Rohan");
       // hm1.put(04, "Rohan");

        System.out.println(hm1);

        HashMap hm2=new HashMap();
        
         hm2.put("Virat", "Rohit");//Entry
         hm2.put("Rohit", "Rohan");
         hm2.put("Hyder", "Rohan");
        
 
         System.out.println(hm2);

         LinkedHashMap lhm=new LinkedHashMap();
        
         lhm.put("Virat", "Rohit");//Entry
         lhm.put("Rohit", "Rohan");
         lhm.put("Hyder", "Rohan");
        
 
         System.out.println(lhm);

        
    }
    
}
