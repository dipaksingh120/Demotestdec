package seleniumsessions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountingTheCharacters {

	public static void main(String[] args) {
		
	String str="iloveindia";
	char[] stoc=str.toCharArray();
	Map<Character, Integer>mp=new HashMap<Character, Integer>();
	for(char ch:stoc)
	{
		if(mp.containsKey(ch))
		{
			mp.put(ch, mp.get(ch)+1);
		}
		else {
			mp.put(ch, 1);
		}
	}
	Set<Map.Entry<Character, Integer>> entry= mp.entrySet();
	for(Map.Entry<Character,Integer> m : entry)
	{
	
			System.out.println("the occurence of each character is:"+m.getKey()+":"+m.getValue());
		
	}
		

	}

}

