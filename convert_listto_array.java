package javatutorial;

import java.util.Arrays;


public class convert_listto_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//convert array to list
		String[] things= {"pumpkin","basket","pen"};
		java.util.LinkedList<String> list=new java.util.LinkedList<String>(Arrays.asList(things));
		
		list.add("meat");
		list.addFirst("white");
		
		//convert list to array
		things=list.toArray(new String[list.size()]);
		
		for(String x:things)
		System.out.printf("%s ",x);

	}

}
