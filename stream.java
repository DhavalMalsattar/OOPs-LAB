/*
// Java program illustrating the working of InputStream method
// mark(), read(), skip()
// markSupported(), close(), reset()
import java.io.*;

public class stream
{
	public static void main(String[] args) throws Exception
	{
		InputStream geek = null;
		try {
			geek = new FileInputStream("ABC.txt");
			// read() method : reading and printing Characters
			// one by one
			System.out.println("Char : "+geek.read());
			System.out.println("Char : "+(char)geek.read());
			System.out.println("Char : "+(char)geek.read());
			// mark() : read limiing the 'geek' input stream
			geek.mark(6);
			// skip() : it results in redaing of 'e' in G'e'eeks
			geek.skip(1);
			System.out.println("skip() method comes to play");
			System.out.println("mark() method comes to play");
			System.out.println("Char : "+(char)geek.read());
			System.out.println("Char : "+(char)geek.read());
			System.out.println("Char : "+(char)geek.read());
			boolean check = geek.markSupported();
			if (geek.markSupported())
			{
				// reset() method : repositioning the stram to
				// marked positions.
				geek.reset();
				System.out.println("reset() invoked");
				System.out.println("Char : "+(char)geek.read());
				System.out.println("Char : "+(char)geek.read());
			}
			else
				System.out.println("reset() method not supported.");


			System.out.println("geek.markSupported() supported"+" reset() : "+check);
		}
		catch(Exception excpt)
		{
			// in case of I/O error
			excpt.printStackTrace();
		}
		finally
		{
			// releasing the resources back to the
			// GarbageCollector when closes
			if (geek!=null)
			{
				// Use of close() : closing the file
				// and releasing resources
				geek.close();
			}
		}
	}
}

*/



////* **********************************New Code************************************* */



/*


// Java program illustrating ready() and close() method
import java.io.*;
public class stream
{
	public static void main(String[] args)
	{
		try
		{
			// initializing FileInputStream
			FileInputStream geek = new FileInputStream("ABC.txt");
			// Initializing InputStreamReader object
			InputStreamReader in_strm = new InputStreamReader(geek);
			int t;
			while((t=in_strm.read())!= -1)
			{
				// convert the integer true to character
				char r = (char)t;
				System.out.println("Character : "+r);
				// check if the stream in_strm ready
				boolean b = in_strm.ready();
				// Use of ready() methods
				System.out.println("Ready? : "+b);
			}
			// Use of close() method to Close InputStreamReader
			in_strm.close();
			// Closing FileInputStream
			geek.close();
		}
		catch (FileNotFoundException fnfe)
		{
			System.out.println("NO Such File Exists");
		}
		catch (IOException except)
		{
			System.out.println("IOException occurred");
		}
	}
}

*/


////* **********************************New Code************************************* */


import java.io.*;
public class stream {
	public static void main(String[] args) {
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0.0; // cumulative total
		int n = 0; // number of values
		try {
			while (stdin.readLine()!=null){
	    		double y;
    			String number = stdin.readLine();
    			y = Double.parseDouble(number);
    			//double x = stdin.readDouble();
    			sum = sum + y;
    			n++; 
			}
		} catch (Exception e){
	    	// TODO: handle exception
		}
		System.out.println(sum / n);
	}
}