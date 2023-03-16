package MyCode;

import java.util.ArrayList;

public class forLoop {

    public static void main(String[] args) {

        int [] arr2 = {12,34,56,78,13,25,67,};
        // check if arr2 has multiple of 2

        for (int i = 0; i< arr2.length; i++){
            if (arr2[i]% 2==0){
                System.out.println(arr2[i]);
               // break;
            }else {
                System.out.println(arr2[i]+ "these are odd numbers ");
            }

        }

        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Mustafa Ayan");
        myList.add("this my job ");
        System.out.println( myList.size());
        System.out.println( myList.get(1));


        String s = "this is my java";
        String [] split = s.split(" ");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        System.out.println(split[3]);

        for (int g =0; g<s.length() ;g++){
            System.out.println( s.charAt(g));
        }



    }
}
