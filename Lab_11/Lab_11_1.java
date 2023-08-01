import java.util.*;

public class Lab_11_1 extends Thread{

    static int max;
    static Object o = new Object();
    static int t=0;
    int r;
    public Lab_11_1(int r){
        this.r=r;
    }
    public void run(){
        while(t<=max-1){
            synchronized(o){
                while(t%2!=r){
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
        Lab_11_1 t2 = new Lab_11_1(0);
        Lab_11_1 t1 = new Lab_11_1(1);
        t2.start();
        t1.start();
    }
}