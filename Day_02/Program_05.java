package CollegeJAVA.Day_02;

 class Student3 {
    int roll;
    String number;
    float marks;

    void setData(){
        roll = 33;
        number = "88";
        marks = 89.7f;
    }
    void setData(int r,String n,float m){
        roll=r;
        number=n;
        marks=m;
    }
    void display(){
        System.out.println("Roll is: "+roll);
        System.out.println("Number is: "+number);
        System.out.println("Marks is: "+marks);
    }
}
class Student3Test{
    public static void main(String[] args){
        Student3 s1 = new Student3();
        s1.setData();
        s1.display();
        s1.setData(34,"99",86.9f);
        s1.display();

    }
}
