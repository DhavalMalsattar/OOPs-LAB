import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'twoStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER maxSum
     *  2. INTEGER_ARRAY a
     *  3. INTEGER_ARRAY b
     */

    public static int twoStacks(int maxSum, List<Integer> a1, List<Integer> b1) {
    // Write your code here
        int sum=0,c=0,ni=0,mi=0;
        int n=a1.size();
        int m=b1.size();
        int a[] = new int[n];
        int b[] = new int[m];
        
        for(int i=0;i<n;i++){
            a[i]=a1.get(i);
        }
    
        for(int i=0;i<m;i++){
            b[i]=b1.get(i);
        }
        
        while(sum+a[ni]<=maxSum){
            sum += a[ni];
            ni++;
            System.out.println(ni+" "+mi+sum);
            if(ni>n-1){
                while(sum+b[mi]<=maxSum){
                sum += b[mi];
                mi++;
                System.out.println(ni+" "+mi+" "+sum);
                if(mi>m-1){
                    break;
                }
                }
                mi--;
                break;
            }
        }
        ni--;
        System.out.println(ni+"*"+mi+sum);
        while(sum-a[ni]+b[mi]<=maxSum){
            sum=sum-a[ni]+b[mi];
            ni--;
            mi++;
            System.out.println(ni+" "+mi+sum);
            if(mi>m-1){
                    break;
            }
            while(sum+b[mi]<=maxSum){
                sum += b[mi];
                mi++;
                System.out.println(ni+" "+mi+sum);
                if(mi>m-1){
                    break;
                }
            }
            
        }
        mi--;
        
        
//         Stack<Integer> A=new Stack<>();
//         Stack<Integer> B=new Stack<>();
        
//         for(int i=0;i<n;i++)
//         {
//             A.push(a.get(n-i-1));
//         }
//         for(int i=0;i<m;i++)
//         {
//             B.push(b.get(m-i-1));
//         }
//         for(int i=0;sum<maxSum;i++)
//         {
            
//             if(A.peek()>B.peek())
//             {
//                  sum+=B.pop();  
//                  c++;
//             }
//             else
//             {
//                  sum+=A.pop();
//                  c++;
        
//             }
//         }
         return ni+mi+2;

        
}
}
public class p1 {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        int ti = sc.nextInt();
        for(int ni=0;ni<ti;ni++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int maxSum = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<Integer>(n);
            ArrayList<Integer> b = new ArrayList<Integer>(m);
            for(int i=0;i<n;i++){
                a.add(sc.nextInt());
            }
            for(int i=0;i<m;i++){
                b.add(sc.nextInt());
            }
            int result = Result.twoStacks(maxSum, a, b);
            System.out.println(result);
        }
    }
}
    
