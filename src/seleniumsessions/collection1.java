package seleniumsessions;

import java.util.HashSet;
import java.util.Iterator;

public class collection1 
{
	public static void main(String args[])
	{
		HashSet<String> set= new HashSet<String>();
		set.add("ravi");
		set.add("prakash");
		set.add("manoj");
		set.add("tiwari");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) 
		{
	    System.out.println(itr.next());
		}
		
	}

}
