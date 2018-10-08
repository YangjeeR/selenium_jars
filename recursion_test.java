package javatutorial;

public class recursion_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fact(5));

	}
	
	public static long fact (long n)
	{
		if(n<=1)

			return 1;
			
			else 
				
			return n * fact(n-1);//calling same method
		
	}

}
