package Lab_8;

interface Shape{
    double getArea();
    double getPerimeter();
    void displayDetails();
}
class Ractangle implements Shape{
    double height;
    double width;
    Ractangle(double l,double m){
        height = l;
        width = m;
    }
    public double getArea(){
        return height*width;
    }
    public double getPerimeter(){
        return height+width;
    }
    public void displayDetails(){
        System.out.println("Area Ractangle = "+getArea());
        System.out.println("perimeter Ractangle = "+getPerimeter());
    }
}
class Circle implements Shape{
    double radius;
    Circle(double r){
        radius = r;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getPerimeter(){
        return Math.PI*2*radius;
    }
    public void displayDetails(){
        System.out.println("Area Circle = "+getArea());
        System.out.println("perimeter Circle = "+getPerimeter());
    }
}
public class Lab_8_3{
    public static void main(String[] args) {
        Ractangle r1 = new Ractangle(10,30);
        Circle c1 = new Circle(10);
        r1.displayDetails();
        c1.displayDetails();
    }
}