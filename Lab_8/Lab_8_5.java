package Lab_8;
import java.util.*;
interface Sortable{
    void sort(int arr[]);
}
class BubbleShort implements Sortable{
    public void sort(int a[]){
        int n=a.length;
        int t;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
}
class InsertionShort implements Sortable{
    public void sort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int j=i;
            int t=a[i];
            while(j>0 && a[j-1]>t ){
                a[j]=a[j-1];
                j--;
            }
            a[j]=t;
        }
    }
}
public class Lab_8_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element");
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=a[i];
        }

        System.out.println("With Bubble Short");
        BubbleShort b1 = new BubbleShort();
        b1.sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("With Insertion Short");
        InsertionShort i1 = new InsertionShort();
        i1.sort(b);
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
    }
}
