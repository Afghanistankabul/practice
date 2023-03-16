package MyCode;
import java.util.Scanner;

public class userInPut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        String homeAddress;
        int age;
        String contactNumber;
        System.out.println("please enter you first name:");
        firstName=scanner.nextLine();
        System.out.println("please enter your last name:");
        lastName=scanner.nextLine();
        System.out.println("enter your home address:");
        homeAddress=scanner.nextLine();
        System.out.println("enter you age>:");
        age =scanner.nextInt();
        System.out.println("enter you contact:");
        contactNumber=scanner.nextLine();
        System.out.println("your first name is "+firstName);
        System.out.println("your last  name is "+lastName);
        System.out.println("your  home address is "+ homeAddress);
        System.out.println("your age  is " +age);
        System.out.println("your contact number is "+ contactNumber);





    }
}
