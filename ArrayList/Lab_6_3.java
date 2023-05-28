import java.util.*;
public class Lab_6_3
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
	    for(int i=0;i<len/2;i++){
	        //arrl.add((int)(Math.random()*100));
	        temp=arrl.get(i);
	        arrl.set(i,arrl.get(len-1-i));
	        arrl.set(len-1-i,temp);
	    }
	    System.out.print("your reversed array is\n"+arrl);
	    System.out.println();
	}
}
