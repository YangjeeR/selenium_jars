package javatutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class collections_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fruits= {"banana","lemon","apple","grapes"};
		List<String> l1=Arrays.asList(fruits);
		
		Collections.sort(l1);
		System.out.printf("%s\n", l1);
		
		Collections.sort(l1,Collections.reverseOrder());
		System.out.printf("%s\n", l1);
		
		Character[] ch= {'a','y','p'};
		List<Character> l=Arrays.asList(ch);
		System.out.println("List is :");
		output(l);
		
		//reverse list
		Collections.reverse(l);
		System.out.println("After reverse list is :");
		output(l);
		//create new array and conver to list
		Character[] chcopy= new Character[3];
		List<Character> listcopy=Arrays.asList(chcopy);
		//copy array elements to new list
		Collections.copy(listcopy, l);
		System.out.println("Copy of list :");
		output(listcopy);
		
		//fill collections
		Collections.fill(l, 'P');
		System.out.println("List is filled with:");
		output(l);
	}
	
	private static void output(List<Character> list)
	{
		for(Character x:list)
			System.out.printf("%s ", x);
		System.out.println();
	}

}
