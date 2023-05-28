import java.util.*;
public class Lab_6_4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t1,count,len = sc.nextInt();
	    
	    ArrayList<Integer> arrl = new ArrayList<Integer>();
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    for(int i=0;i<len;i++){
	        arrl.add(sc.nextInt());
	        temp.add(arrl.get(i));
	    }
	    System.out.print(arrl);
	    System.out.println();
	    while(!temp.isEmpty()){
            count=0;
            t1=temp.get(0);
            for(int i=0;i<len;i++){
                if(t1==temp.get(i)){
                    count++;
                }
            }
            len -= count;
            temp.removeAll(Collections.singleton(t1));
            System.out.println("number "+t1+" :"+count);
        }
	}
}
