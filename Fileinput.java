import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Fileinput
 */
public class Fileinput {

    public static void main(String[] args) {
        int i=0,n=0,n1=0,n2=0,l=0;
        String arr[];
        try(FileReader fin =new FileReader("input.txt");FileWriter fout =new FileWriter("output.txt")) {

            BufferedReader br=new BufferedReader(fin);
            String s1=br.readLine();
            while(s1!=null){
                n += s1.split(" ").length;
                n1 += s1.split("").length;
                //System.out.println(s1);
                s1=br.readLine();
                n2++;
            } 
            fout.write("Number of words : "+ n,0,("Number of words : "+ n).length());
            fout.write("\n");
            fout.write("Number of Characters : "+ n1,0,("Number of Characters : "+ n1).length());
            fout.write("\n");
            fout.write("Number of Spaces : "+ (n-n2),0,("Number of Spaces : "+ (n-n2)).length());            
            fout.write("\n");
            fout.write("Number of lines : "+ n2,0,("Number of lines : "+ n2).length());      
            System.out.println("Word count has been writen in the output.txt file according to given below");
            System.out.println("Number of words : "+ n);
            System.out.println("Number of Characters : "+ n1);
            System.out.println("Number of Spaces : "+ (n-n2));
            System.out.println("Number of lines : "+ n2);
            fin.close();
            fout.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        
        
    }
}