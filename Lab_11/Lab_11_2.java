import java.util.*;
class factorial implements Runnable
{
    int s,e,pans;
    factorial(int s,int e)
    {
        this.s=s;
        this.e=e;
        this.pans=1;
    }
    public int getfactorial()
    {
        return pans;
    }
    public void run()
    {
        for(int i=s;i<=e;i++)
        {   
        pans*=i;
        } 
    
    }
    }   
    public class Lab_11_2
    {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int t=sc.nextInt();
    int lp=n/t;
    int r=n%t;
    factorial a[]=new factorial[t];
    Thread []thread=new Thread[t];
    for(int i=0;i<t;i++)
    {
        int s=(i*lp+1);
        int e;
        if(i<t-1){
            e =s+lp-1;
        }
        else{
            e =s+lp-1+r;
        }
        a[i]=new factorial( s,e);
        thread[i]=new Thread(a[i]);
        thread[i].start();
    }
    for(int i=0;i<t;i++)
    {
        try {
        thread[i].join();
        } catch(Exception e) {
        }
    }   
    long ans=1;
    for(int i=0;i<t;i++)
    {
        ans*=a[i].getfactorial();
    }
    System.out.println(ans);
    }
}
