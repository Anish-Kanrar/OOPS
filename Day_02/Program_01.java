package CollegeJAVA.Day_02;

public class Student {
    String name;
    String city;
    int age;

    void setData(){
        name="Anish Kanrar";
        city="Howrah";
        age=20;
    }

    void printData(){
        System.out.println("Name is: "+name);
        System.out.println("City is: "+city);
        System.out.println("Age is: "+age);

    }
}

 class studentTest{
    public static void main(String[] args){
        Student s1=new Student();
        s1.setData();
        s1.printData();
    }
}
