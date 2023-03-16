package MyCode;

public class CheckAge {






    static void checkAge(int Age){

        if (Age < 18) {
            System.out.println("this is person  not enough old");
        }
        else {
            System.out.println("this person is enough old ");
        }

    }

    public static void main(String[] args) {
        checkAge(17);
        checkAge(37);

        String Ali= "this is very  of you";
        System.out.println(Ali.charAt(1));
    }

}
