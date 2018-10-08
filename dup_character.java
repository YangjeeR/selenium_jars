package javatutorial;

import java.util.HashMap;
import java.util.Set;

public class dup_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	dup_character obj=new dup_character();
	obj.dupcharacter("Better Butter");
		
	}
	static void dupcharacter(String inputchar)
	{
		HashMap<Character,Integer> charmap=new HashMap<Character,Integer>();
		
		char[] str=inputchar.toCharArray();
		
		for(char c: str)
		{
			if(charmap.containsKey(c))
			{
				charmap.put(c,charmap.get(c)+1);
			}
			
			else
			{
				charmap.put(c,1);
			}
		}
		
	Set<Character> alldupstr= charmap.keySet();
	 System.out.println("Duplicate Characters In "+inputchar);
	
	for(char b:alldupstr)
		
	{
		if(charmap.get(b)>1)
		{
			System.out.println(b +":" + charmap.get(b));
		}
	}
		
	}


}
