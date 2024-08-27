class Student {
    int roll;
    String name;
    int[] marks = new int[3];

    Student(int roll, String name, int m1, int m2, int m3) {
        this.roll = roll;
        this.name = name;
        this.marks[0] = m1;
        this.marks[1] = m2;
        this.marks[2] = m3;
    }

    double getAverage() {
        return (marks[0] + marks[1] + marks[2]) / 3.0;
    }

    void display() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
    }
}

public class BestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student(1, "John", 85, 78, 92);
        students[1] = new Student(2, "Jane", 88, 90, 95);
        students[2] = new Student(3, "Mike", 80, 85, 87);

        Student bestStudent = students[0];

        for (Student student : students) {
            if (student.getAverage() > bestStudent.getAverage()) {
                bestStudent = student;
            }
        }

        System.out.println("Best Student:");
        bestStudent.display();
    }
}
