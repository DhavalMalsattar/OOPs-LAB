import java.util.*;

class Person{
    String name;
    int age;
    public void dislayInfo(){
        System.out.println("name of the person is "+this.name);
        System.out.println("age of the person is "+this.age);
    }
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
}
class Student extends Person{
    int id;
    public void dislayInfo(){
        System.out.println("name of the student is "+this.name);
        System.out.println("age of the student is "+this.age);
        System.out.println("id of the student is "+this.id);
    }
    public Student(String name,int age,int id){
        super(name,age);
        this.id = id;
    }
}


public class Lab_7_5
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    Person p1 = new Person("Dhava",18);
        Student s1 = new Student("Dhaval",18,202203028);
        Student s2 = new Student("Deep",18,202203012);
        p1.dislayInfo();
        s1.dislayInfo();
        s2.dislayInfo();
       
	    
	}
}
