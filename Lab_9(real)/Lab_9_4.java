import java.util.*;

class Revers{
    public static String reverseWord(String s1){
        String s2="",s3="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==' '){
                s2=s3+" "+s2;
                s3="";
                continue;
            }
            s3 +=s1.charAt(i);
        }
        s2=s3+" "+s2;
        return s2;
    }
}
public class Lab_9_4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=Revers.reverseWord(s1);
        System.out.println(s2);
        //
    }
}
