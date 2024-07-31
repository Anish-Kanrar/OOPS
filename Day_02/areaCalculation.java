package CollegeJAVA.Day_02;

class areaCalculation {
    double area(float r){
        return 3.14*r*r;
    }
    double area(float l,float b){
        return l*b;
    }
    double area(float l,float h,float w ){
        return  2*(l*h + l*w+ h*w);
    }
}
class areaCalTest{
    public static void main(String[] args){
        areaCalculation a1= new areaCalculation();
        System.out.println("Area of circle: "+a1.area(2.8f));
        System.out.println("Area of rectangle: "+a1.area(7.8f,7.33f));
        System.out.println("Area of cuboid: "+a1.area(6.8f,9.44f,8.66f));
    }
}
