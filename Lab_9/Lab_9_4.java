package Lab_9;
import java.util.*;
public class Lab_9_4
{
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int n = 0;
	    System.out.println("Enter number ");
        try{
            n=sc.nextInt();
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("Not a Prime Number");
                    return;
                }
            }
            System.out.println(n+" is a Prime Number");
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
	    
	}
}
