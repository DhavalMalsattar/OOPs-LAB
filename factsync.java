import java.util.*;
class factorial implements Runnable{

    int ans=1,st,e;
    static int f=1; 
    public factorial(int n,int t){
        for(int i=0;i<t;i++){
            new Thread(new factorial(i*(n/t)+1,(i+1)*(n/t),0)).start();
        }
        if(n%t!=0)
        new Thread(new factorial(t*(n/t)+1,n,0)).start();
        //System.out.println("final answer is "+f);
    }
    public factorial(int st,int e,int a) {
        this.st=st;
        this.e=e;
    }
    public void run(){
        for(int i=st;i<=e;i++){
            ans *= i;
        }
        System.out.println(ans);
        f *=ans;
        //System.out.println("f is "+f);
    }
} 
public class factsync {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to get factorial : ");
        int n=sc.nextInt();
        System.out.println("Enter number of threads to be used");
        int t=sc.nextInt();
        factorial fc=new factorial(n, t);
        System.out.println("Enter "+fc.f);
    }    
}
