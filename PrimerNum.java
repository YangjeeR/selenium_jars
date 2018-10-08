package javatutorial;

import java.util.Scanner;

public class PrimerNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimerNum obj= new PrimerNum();
		obj.prime_num();
		
		int num=15;
	
		for(int i=2;i<num;i++)
		{
			for(int j=2;j<=i;j++)
			{
				if(j==i)
				{
					System.out.println(j +" is prime number.");
				}
				if(i%j==0)
				{
					break;
				}
			}
		}

	}
	
	public void prime_num()
	{
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scanner.nextInt();
		scanner.close();
		
		boolean isprime=true;
	
		for(int i=2;i<=n/2;i++)
		{
			int temp=n%i;
			
			if(temp==0)
			{
				isprime=false;
				break;
			}		
			
		}
		
		if(isprime)
		{
			System.out.println(n + " is prime number ");
		}
			
		else
		{
			System.out.println(n + " is not prime number ");
			
		}
		
	}
}
