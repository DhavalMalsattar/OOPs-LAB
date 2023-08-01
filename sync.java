import java.util.*;

public class sync extends Thread{

    static int max;
    static Object o = new Object();
    static int t=0;
    int r;
    public sync(int r){
        this.r=r;
    }
    public void run(){
        while(t<max){
            synchronized(o){
                if(t%2!=r){
                                    
                    try {
                        o.wait();
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                }
                System.out.println("From Thread "+r+" : i = "+t);
                t++;
                o.notifyAll();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print");        
        max=sc.nextInt();
        sync t1 = new sync(0);
        sync t2 = new sync(1);
        t1.start();
        t2.start();
    }
    
}
