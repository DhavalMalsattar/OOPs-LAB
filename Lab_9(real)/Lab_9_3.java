import java.util.*;

class Student{
    int id;
    String name,grade;
    Student(int id,String name,String grade){
        this.id=id;
        this.grade=grade;
        this.name=name;
    }
    public String toString(){
        return name;
    }
}
class StudentManager{
    ArrayList<Student> a1 = new ArrayList<Student>();
    void addStudent(Student s1){
        a1.add(s1);
    }
    Student removeStudent(Student s1){
        if(!a1.remove(s1)){
            System.out.println("No such a Student exist with name"+s1.name);
        }
        return s1;
    }
    int getTotalStudents(){
        return a1.size();
    }
    Student getStudentById(int id){
        Student s1 = new Student(0,"Wrong id number","");
        int i;
        for(i=0;i<a1.size();i++){
            if(id==a1.get(i).id){
                s1=a1.get(i);
                break;
            }
        }
        return s1;
    }
    ArrayList<Student> getStudentsByGrade(String grade){
        ArrayList<Student> g1 = new ArrayList<Student>();
        for(int i=0;i<a1.size();i++){
            if(a1.get(i).grade==grade){
                g1.add(a1.get(i));
            }
        }
        return g1;
    }
}
public class Lab_9_3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1=new Student(1,"Dhaval","A+");
        Student s2=new Student(2,"Deven","A");
        Student s3=new Student(3,"Akshay","A");
        Student s4=new Student(4,"Ajay","A+");
        StudentManager m1 = new StudentManager();
        m1.addStudent(s1);
        m1.addStudent(s2);
        m1.addStudent(s3);
        m1.addStudent(s4);
        System.out.println("Students : "+m1.a1.toString());        
        m1.removeStudent(s3);
        System.out.println("Students : "+m1.a1.toString());
        System.out.println("After removing 3rd Student");
        m1.removeStudent(s3);
        System.out.println("Total Number of Student is "+ m1.a1.size());
        System.out.println("name of Student with id 1 is : "+ m1.getStudentById(1).name);
        System.out.println("name of Student with id 3 is : "+ m1.getStudentById(3).name);
        System.out.println("name of Students with grade A+ is : "+m1.getStudentsByGrade("A+").toString());
        
    }
}
