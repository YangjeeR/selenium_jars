package javatutorial;

import java.util.ArrayList;
import java.util.HashSet;

import org.testng.annotations.Test;


public class remove_dup_array {
	@Test
	public void dup_array()
	{
		ArrayList<String> listarray=new ArrayList<String>();
		listarray.add("java");
		listarray.add("code");
		listarray.add("java");
		listarray.add("ram");
		listarray.add("code");
		
		System.out.println("The array is :" + listarray);
		
		HashSet<String> listarrayset=new HashSet<String>(listarray);
		ArrayList<String> listarraywithoutdups=new ArrayList<String>(listarrayset);
		
		System.out.println("The array is :" + listarraywithoutdups);
	}

}
