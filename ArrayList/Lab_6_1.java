package ArrayList;

import java.util.*;

public class Lab_6_1
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int len = sc.nextInt();
	    int temp;
	    ArrayList<Integer> arrl = new ArrayList<Integer>();
	    for(int i=0;i<len;i++){
	        //arrl.add((int)(Math.random()*100));
	        arrl.add(sc.nextInt());
	    }
	    System.out.print(arrl);
	    System.out.println();
	    for(int i=0;i<len-1;i++){
	        for(int j=0;j<len-1-i;j++){
	            if(arrl.get(j)>arrl.get(j+1)){
	                temp=arrl.get(j);
	                arrl.set(j,arrl.get(j+1));
	                arrl.set(j+1,temp);
	            }
	        }
	    }
	    //Collections.sort(arrl);
	    System.out.print(arrl);
	    System.out.println();
	    System.out.print("second last element is :"+arrl.get(len-2));
	    
	    
	    
	}
}
