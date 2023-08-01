package Lab_9;
import java.util.*;
public class Lab_9_2
{
    
    public static double calculateAvrage(int a[]) throws Exception{
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum += a[i];
        }
        return sum/a.length;
    }
    
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    boolean t=true;
	    int n = sc.nextInt();
	    int a[] = new int[n];
	    
	    for(int i=0;i<n;i++){
	        a[i]= sc.nextInt();
	    }
	    
	    
	    try{
	        System.out.println(calculateAvrage(a));
        }
	    catch(Exception ex){
	        System.out.println("Array is empty ");
        }
	    
	    
	}
}
