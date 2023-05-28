import java.util.*;


class Shape{
    public double calculateArea(){
       return 0;
    }
   
}
class Circle extends Shape{
    double r;
    public double calculateArea(){
        return Math.PI*r*r;
    }
}
class Ractangle extends Shape{
    double m;
    double l;
    public double calculateArea(){
        return m*l;
    }
}

public class Lab_7_4
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    Shape s1 = new Shape();
        Circle c1 = new Circle();
        Ractangle r1 = new Ractangle();
        System.out.println("Enter the radius of circle");
        c1.r = sc.nextInt();
	    System.out.println("Enter the length of ractangle");
        r1.l = sc.nextInt();
	    System.out.println("Enter the width of ractangle");
        r1.m = sc.nextInt();
        System.out.println(s1.calculateArea());
        System.out.println("Area of circle");
        System.out.println(c1.calculateArea());
        System.out.println("Area of Ractangle");
        System.out.println(r1.calculateArea());
       
       
	    
	}
}
