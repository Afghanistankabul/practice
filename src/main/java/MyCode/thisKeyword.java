package MyCode;

public  class thisKeyword {

    int year;
    int model;
    String name;
    public thisKeyword(int year, int model, String name)

    {
        this.model=model;
        this.name=name;
        this.year=year;

    }

    public static void main(String[] args) {
        thisKeyword toyota = new thisKeyword(12,34,"i am this ");
        System.out.println( toyota.model);
        System.out.println(toyota.name);
        System.out.println(toyota.year);

    }
}
