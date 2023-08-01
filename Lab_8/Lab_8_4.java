package Lab_8;
import java.util.*;
interface Calculator{
    int add(int a,int b);
    int subtract(int a,int b);
    int multiply(int a,int b);
    double divide(int a,int b);
}
class BasicCalculator implements Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int multiply(int a,int b){
        return a*b;
    }
    public double divide(int a,int b){
        return a/b;
    }
}
public class Lab_8_4 {
    public static void main(String[] args) {
        BasicCalculator b1 = new BasicCalculator();
    int a=90,b=5;
    System.out.println(b1.add(a,b));
    System.out.println(b1.subtract(a,b));
    System.out.println(b1.multiply(a,b));
    System.out.println(b1.divide(a,b));
    }
}
