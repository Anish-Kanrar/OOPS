package CollegeJAVA.Day_02;

 class Student2 {
    int roll;
    String number;
    float marks;

    void setData(int r,String n,float m){
        roll=r;
        number=n;
        marks=m;
    }
    void printData(){
        System.out.println("Roll is: "+roll);
        System.out.println("Number is: "+number);
        System.out.println("Marks is: "+marks);
    }
}
class Student2Test{
    public static void main(String[] args){
        Student2 s2 = new Student2();
        s2.setData(33,"98",89.7f);
        s2.printData();
    }
}
