package Lab_9;
import java.util.*;
public class Lab_9_3
{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int age=0;
	    System.out.println("Enter your age");
        while(age <= 0){
            try {
                age = sc.nextInt();
                if(age<=0)
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Entered value of age is not valid , try again");
            }
        }
	    
	}
}
