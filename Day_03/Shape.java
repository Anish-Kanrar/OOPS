package CollegeJAVA.Day_03;

class Shape {
    void calc_perimeter(){
        //code
    }
    void calc_area(){
        //code
    }
}
class Circle extends Shape{
    //r for radius of circle
    double r,p,A;
    Circle(double r){
        this.r=r;
    }
    void calc_perimeter(){
        //code
        p=2*Math.PI*r;
        System.out.println("perimeter of circle:"+p);
    }
    void calc_area(){
        //code
        A=Math.PI*r*r;
        System.out.println("Area of circle: "+A);
    }
}
class Rectangle extends Shape{
    //l for length,w for breadth
    double l,w,p,A;
    Rectangle(double l,double w){
        this.l=l;
        this.w=w;
    }
    void calc_perimeter(){
        //code

        p=2*(l+w);
        System.out.println("perimeter of circle:"+p);
    }
    void calc_area(){
        //code
        A=w*l;
        System.out.println("Area of circle: "+A);
    }
}

class ShapeTest{
    public static void main(String[] args){
        Circle s1 = new Circle(3.66);
        s1.calc_perimeter();
        s1.calc_area();
        Rectangle s2= new Rectangle(5.33,8.54);
        s2.calc_perimeter();
        s2.calc_area();
    }
}
