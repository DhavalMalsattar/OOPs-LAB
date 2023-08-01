package Lab_9;
import java.sql.Array;
import java.util.*;
public class Lab_9_5
{
    
    public static String getWord(String a[],int i) throws ArrayIndexOutOfBoundsException{
        return a[i];
    }
	public static void main(String[] args) {        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String arr[] = s.split(" ");
        int i,n=arr.length;

        System.out.println("Enter the index :");
        i=sc.nextInt();
        
        try {
            System.out.println("Word at Index "+i+" is : "+getWord(arr,i));
        } catch (Exception e) {
            System.out.println("Entered value of index is invalid");
        }
	    
	    
	}
}
