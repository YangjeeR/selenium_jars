package javatutorial;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words={"Sunita","Anita","Himsikha","Anil"};
		List<String> list1= new ArrayList<String>();

		for(String x:words)
			list1.add(x);
		
		String[] name={"Anita","Himsikha"};
		List<String> list2= new ArrayList<String>();

		for(String y:name)
			list2.add(y);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.printf("%s   ",list1.get(i));
		}
		
		editList(list1,list2);
		
		System.out.println();
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.printf("%s   ",list1.get(i));
		}
	}

	public static void editList(Collection<String> l1,Collection<String>l2)
	{
		Iterator<String> iter=l1.iterator();
		while(iter.hasNext())
		{
			if(l2.contains(iter.next()))
				iter.remove(); 
		}
	}
}
