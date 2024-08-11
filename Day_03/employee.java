package CollegeJAVA.Day_03;
//The main purpose of constructor is initializing the obj.

public class employee {
    int id;
    String name;
    String dob;
    String designation;
    double bs;
    employee(int id,String name, String dob,String designation,double bs){   //parameterized constructor
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.designation=designation;
        this.bs=bs;
    }
    void printData(){  //print employee's details & net salary
        double HRA = 0.20*bs;
        double DA = 0.90*bs;
        double netSalary = bs+HRA+DA;

        System.out.println("Employee id is "+id);
        System.out.println("Name is "+name);
        System.out.println("Date of birth is "+dob);
        System.out.println("Designation is "+designation);
        System.out.println("Basic salary is "+bs);
        System.out.println("Net salary is "+netSalary);
    }
}
class employeeTest{
    public static void main(String[] args) {
        employee e = new employee(12345,"Virat Kohali","05.11.1988","Cricketer",1300000.78);
        e.printData();
    }
}
