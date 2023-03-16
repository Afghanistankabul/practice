package MyCode;

import java.util.ArrayList;

public class MyPractice {
    public static void main(String[] args) {

        int [] even = {23,24,45,68};
        for (int i =0; i < even.length; i ++){
            if (even[i] % 2==0){
                System.out.println(even[i]);

            }else {
                System.out.println(even[i]+"not eligable");
            }
        }

        ArrayList <String> Ayan= new ArrayList<>();
        Ayan.add("mustafa");
        Ayan.add("mansoor");
        System.out.println(Ayan.get(1));

        String ahmad = "mustafa Ayan Afghanistan";
        String[] ali=  ahmad.split(" ");
        System.out.println(ali.length);

        for (int i =0; i <ahmad.length(); i++){
            System.out.println(ahmad.charAt(i));
        }
        for (int h =ahmad.length()-1;h>=0;h--){
            System.out.println(ahmad.charAt(h));
        }
        System.out.println("_________________________________________________");

        int [] average ={4,6,9,12,23};
        int size = average.length;
        int sum=0;

        for (int x=0;x<average.length;x++){
            sum+= average[x];

            double result =sum/size;
            System.out.println(result);
        }



    }
}
