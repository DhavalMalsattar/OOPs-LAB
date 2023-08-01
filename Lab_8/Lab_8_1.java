package Lab_8;

abstract class Student{
    String name;
    int id;
    abstract void displayDetails();
    Student(String name,int id){
        this.name = name;
        this.id = id;
    }
}
class UnderGraduateStudent extends Student{
    int year;
    void displayDetails(){
        System.out.println("Student name = "+name);
        System.out.println("Student id = "+id);
        System.out.println("year of Graduation = "+year);
    }
    UnderGraduateStudent(String name,int id,int year){
        super(name,id);
        this.year = year;
    }
}
class PostGraduateStudent extends Student{
    int year;
    String researchTopic;
    void displayDetails(){
        System.out.println("Student name = "+name);
        System.out.println("Student id = "+id);
        System.out.println("year of Graduation = "+year);
        System.out.println("Research topic = "+researchTopic);
    }
    PostGraduateStudent(String name,int id,int year,String researchTopic){
        super(name,id);
        this.year = year;
        this.researchTopic = researchTopic;
    }
}
public class Lab_8_1
{
	public static void main(String[] args) {
		UnderGraduateStudent u1 = new UnderGraduateStudent("Dhaval Malsattar",202203028,2026);
		u1.displayDetails();
		System.out.println();
		PostGraduateStudent p1 = new PostGraduateStudent("Dhaval Malsattar",202203028,2026,"Tic Tac Toe");
		p1.displayDetails();
		
	}
}

