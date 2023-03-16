package MyCode;

public class practice {
    public static void main(String[] args) {

        // to find the greatest number using if class
        int a = 4;
        int b = 23;
        if (a>b) {
            System.out.println(" A is more then b---->   " + a);

        } else {
            System.out.println("B is more then a------>    " + b);
        }

        // to print odd numbers using for loop
        for (int i = 1; i < 10; i += 2) {
            System.out.println("these are odd numbers-----> " + i);
        }
        // to print odd numbers using while loop
        int i = 1;
        while (i < 20) {
            System.out.println("this is while loop odd numbers out put    " + i);
            i = i + 2;
        }
        // to print even numbers using for loop
        for (int evenNumbers = 0; evenNumbers < 30; evenNumbers += 2) {
            System.out.println(evenNumbers);
        }
        // single countdown from 100 to 90 using for loop
        for (int numbers =100;numbers>90;numbers-=2){
            System.out.println("this the result---->  "+numbers);
        }

        // to understand if a number is positive or negative using if class
        int num=-1;
        if (num>0){
            System.out.println(" This is a positive");
        }
        else if(num<0) {
            System.out.println("This is a negative number");
        }
        else {
            System.out.println("The number is 0");
        }


    }
}
