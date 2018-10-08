package javatutorial;

import org.testng.annotations.Test;

public class prac_array {

@Test
public void array_test()
{
	double[] mylist={1.2,3.2,4.7,1.7,8.9};
	//print all array
	for(int i=0;i<mylist.length;i++)
	{
		System.out.println("The list is" + mylist[i]);
	}
	
	//sum array
	double total=0;
	for(int i=0;i<mylist.length;i++)
	{
		total += mylist[i];
	}
	
	System.out.println("The sum of array is " + total);
	
	//find max array
	double total1=mylist[0];
	for(int i=1;i<mylist.length;i++)
	{
		if(mylist[i]>total1)
		{
		total1 = mylist[i];
		}
	}
	System.out.println("The max array is " + total1);
	
	//for
	for(double list:mylist)
	{
		System.out.println("The list is " + list);
	}
// array using method
	passarray(new int[] { 1,3,5,8,10});
}

public void passarray(int[] array)
{
	for(int array1:array)
	{
		System.out.println(array1);
	}
}

}
