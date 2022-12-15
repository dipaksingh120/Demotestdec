package seleniumsessions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class duplicateWords {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
String st= "the way you love me i love the same way ";
String s[]=st.split(" ");
Map<String, Integer> mp= new HashMap<String,Integer>();
for(String str:s)
{
	if( mp.containsKey(str))
	{ mp.put(str, mp.get(str)+1);}
	else {mp.put(str, 1);}
}
/*Set<Map.Entry<String,Integer>> entry=mp.entrySet();
for(Entry<String, Integer> m: entry)
{
	System.out.println(m.getKey()+":"+m.getValue());
}
*/
Set<String> wordsInString=mp.keySet();
System.out.println("the given word count is:");
for(String word:wordsInString)
{
	System.out.println(word+":"+mp.get(word));
}
}

}
