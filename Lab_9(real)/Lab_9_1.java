import java.util.*;

class ManipulateString{
    public static String manipulateString(String s1){
        s1=s1.replaceAll("[0-9]", "");
        String s2="";
        int n=s1.length();
        for(int i=n-1;i>=0;i--){
            s2 += s1.charAt(i);
        }
        s2 = s2.toUpperCase();
        return s2;
    }
}

public class Lab_9_1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        System.out.println(ManipulateString.manipulateString(s1));
    }
}
