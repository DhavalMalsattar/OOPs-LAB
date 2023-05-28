import java.util.*;


class Geometry{
    public double calculateArea(double r){
        return Math.PI*r*r;
    }
    public double calculateArea(double l,double m){
        return m*l;
    }
}


public class Lab_7_2
{
	public static void main(String[] args) {
	    
        Scanner sc = new Scanner(System.in);
        Geometry g1 = new Geometry();
	    System.out.println("Enter the radius of circle");
        double r = sc.nextInt();
	    System.out.println("Enter the length of ractangle");
        double l = sc.nextInt();
	    System.out.println("Enter the width of ractangle");
        double m = sc.nextInt();
	    System.out.print("Area of circle is = "+g1.calculateArea(r));
        System.out.println();
	    System.out.print("Area of Ractangle is = "+g1.calculateArea(l,m));
	    
	    
	}
}
