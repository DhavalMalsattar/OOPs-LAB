package Lab_8;
abstract class Student{
    String name;
    int age;
    double grade;
    abstract double calculateAverageGrade();
    Student(String name,int age,double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
class ScienceStudent extends Student{
    static int count=0;
    static double TotalPhysicsGrade=0;
    double physicsGrade;
    double calculateAverageGrade(){
        return (grade+physicsGrade)/2;
    }
    static void calculateAveragePhysicsGrade(){
            System.out.println("*********************");
            System.out.println(TotalPhysicsGrade/count);
    }

    ScienceStudent(String name,int age,double grade,double physicsGrade){
        super(name,age,grade);
        this.physicsGrade = physicsGrade;
        count++;
        this.TotalPhysicsGrade += physicsGrade;
    }
    void displayDetails(){
        System.out.println("Student name = "+name);
        System.out.println("Student age = "+age);
        System.out.println("Physics Grade = "+physicsGrade);
        System.out.println("Average Grade = "+this.calculateAverageGrade());
        System.out.println();
    }
}
public class Lab_8_2
{
	public static void main(String[] args) {
		
        ScienceStudent s1 = new ScienceStudent("Dhaval", 18, 9.9, 10);
        s1.displayDetails();
        ScienceStudent s2 = new ScienceStudent("Deven", 18, 8.9, 9);
        s2.displayDetails();
        ScienceStudent s3 = new ScienceStudent("Dhruv", 18, 7.9, 7);
        s3.displayDetails();
        ScienceStudent s4 = new ScienceStudent("Dhaval2", 18, 10, 10);
        s4.displayDetails();

        ScienceStudent.calculateAveragePhysicsGrade();

	}
}
