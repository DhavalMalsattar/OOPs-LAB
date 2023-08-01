package Lab_9;
import java.sql.Array;
import java.util.*;
public class Lab_A_9_5
{
    static String arr[];
    static int n=0;
    public static void split(Scanner sc){
        String s;
        if(sc.hasNext()){
            n++;
            s = sc.next();
            split(sc);
        }else{
            arr = new String[n];
            return;
        }
        arr[n-1]=s;
        n--;
    }
	public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.nextLine();
        Scanner sc = new Scanner(s);
        
        split(sc);
        System.out.println(Arrays.toString(arr));
	    
	    
	}
}
