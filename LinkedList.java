package javatutorial;

import java.util.List;
import java.util.ListIterator;

public class LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] things= {"basket","ball","onion","garlic","gloves"};
		List<String> list1=new java.util.LinkedList<String>();
		for(String x:things)
		list1.add(x);
		
		String[] makeup= {"eyeshadow","lipstick","ring","watch","hairbrush"};
		List<String> list2=new java.util.LinkedList<String>();
		for(String y:makeup)
		list2.add(y);
		
		list1.addAll(list2);
		list2=null; //free memory
		
		printme(list1);
		removelist(list1,2,5);
		printme(list1);
		reverselist(list1);

	}
	
	private static void printme(List<String> l)
	{
		for(String b:l)
		System.out.printf("%s ", b);
		System.out.println();
		
	}
	
	
	private static void removelist(List<String> l,int from,int to)
	{
		l.subList(from, to).clear();
	}
	
	private static void reverselist(List<String> l)
	{
		ListIterator<String> it=l.listIterator(l.size());
		while(it.hasPrevious())
			System.out.printf("%s ",it.previous());
	}

}
