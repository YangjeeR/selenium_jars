package javatutorial;

import java.text.*;
import java.util.Date;

public class java_mis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Date date =new Date();
     SimpleDateFormat dateformat = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz ");
     
     System.out.println("Current date is : " + dateformat.format(date));
     
     java_mis ae = new java_mis();
     StringBuffer str1 = new StringBuffer("passBy ");
     ae.printOut(str1);
     System.out.println(str1); // prints passBy reference
	}
	
	public void printOut(StringBuffer str2) {
		  str2.append("Reference");
		  System.out.println(str2); // prints passBy reference
		 }

}
