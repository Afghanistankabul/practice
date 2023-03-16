package MyCode;

public class Student {

    String name;
    int age ;
    String address ;





    public void setName(String name){

        this.name=name;
    }
    public void setAge(int age){
        this.age=age;

    }
    public void setAddress(String address){
        this.address=address;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;

    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student myStudent = new Student("Mustafa",34,"breezy Bay Circle");
        System.out.println(myStudent.getAge());
        System.out.println(myStudent.getName());
        System.out.println(myStudent.getAddress());

    }

}
