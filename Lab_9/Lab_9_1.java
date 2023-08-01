package Lab_9;
import java.util.*;
public class Lab_9_1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    boolean t=true;
	    int a,b;
	    double c;
	    while(t){
	        try{
	            a=sc.nextInt();
	            b=sc.nextInt();
	            c=a/b;
	            System.out.println("a/b = "+(double)a/b);
	            t=false;
	        }
	        catch(Exception ex){
	            System.out.println("division by zero is not possible , Enter diffrent numbers");
	        }
	    }
	    
	}
}
