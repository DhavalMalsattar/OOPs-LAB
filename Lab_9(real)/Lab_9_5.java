import java.util.*;

class MathUtils{
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(Double a,double b){
        return a+b;
    }
}
public class Lab_9_5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5 + 7 = "+MathUtils.add(5, 7));
        System.out.println("5 + 7 + 9 = "+MathUtils.add(5, 7, 9));
        System.out.println("5.5 + 7.7 = "+MathUtils.add(5.5, 7.7));
    }
}
