package MyCode;

public class mainClass extends abustractionPractice{


    @Override
    public void notFull() {
        System.out.println("this mine");
    }

    public static void main(String[] args) {
        mainClass my =new mainClass();
        my.fullBody();
        my.notFull();

    }
}

