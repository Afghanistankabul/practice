package MyCode;

public class thisKeyword1 {
    public thisKeyword1()
    {
        this("ayan");
        System.out.println("first");
    }
   public thisKeyword1(String name)
    {
        this(34);
        System.out.println( name);

    }
    public thisKeyword1(int age)
    {
        System.out.println("third "+age);

    }
    public void display()
    {
        System.out.println("i am method");
    }


    public static void main(String[] args) {
       /* thisKeyword1 main = new thisKeyword1();
        thisKeyword1 main1 = new thisKeyword1("i am second");
        thisKeyword1 main2 = new thisKeyword1(23);
        main.display();*/
        thisKeyword1 myMain = new thisKeyword1();
        myMain.display();




    }
}
