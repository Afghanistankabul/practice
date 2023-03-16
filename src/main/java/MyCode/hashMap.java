package MyCode;

import java.util.HashMap;
import java.util.Map;

public class hashMap {


        public static void main(String args[]){
            //create a HashMap and print
            HashMap<Integer,String> colorsMap=new HashMap<Integer,String>();
            System.out.println("Initial Map: "+colorsMap);
            //put some initial values into it using put method
            colorsMap.put(100,"Red");
            colorsMap.put(101,"Green");
            colorsMap.put(102,"Blue");
            //print the HashMap
            System.out.println("After adding elements:");
          //  for(Map.Entry m:colorsMap.entrySet()){
             //   System.out.println(m.getKey()+" "+m.getValue());

        //}
            for (Map.Entry l:colorsMap.entrySet()){
                System.out.println(l.getKey()+" "+l.getValue());
            }
    }
}
