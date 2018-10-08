package javatutorial;


public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	fibonacci obj=new fibonacci();
	obj.fibonacci1(12);
	
     int number=12;
	System.out.println("Fibonacci series upto " + number +" numbers : "); 
	//printing Fibonacci series upto number 
	for(int i=1; i<=number; i++)
	{ System.out.print(fibonacci2(i) +" ");
	}
	System.out.println("");
	obj.fibonacci3(12);
	obj.prime(10);
		
	}
		//using iteration
		public void fibonacci1(int number)
		{
			
			int fibonacci=1,fibo1=1,fibo2=1;
			for(int i=3;i<=number;i++)
			{
				fibonacci=fibo1+fibo2;
				fibo1=fibo2;
				fibo2=fibonacci;
				//System.out.println("The fibinacci series of " + i +" is " + fibonacci);
			}
		System.out.println("The fibinacci series of " + number +" is " + fibonacci);
		
			
		}
		
		//using recursion
		
		public static int fibonacci2(int number)
		{ 
			if(number == 0)
	        return 0;
	    else if(number == 1)
	      return 1;
	   else
	      return fibonacci2(number - 1) + fibonacci2(number - 2);
			
		}
		
		//while loop
		public void fibonacci3(int num)
		{
			int fibonacci=1,fibo1=1,fibo2=1,i=3;
			
			while(i<=num)
				
			{
				fibonacci=fibo1+fibo2;
				fibo1=fibo2;
				fibo2=fibonacci;
				i++;
			}
			
			System.out.println("The fibonacci series of " + num + " is "+ fibonacci);
		}
		
		public void prime(int num)
		{
			for(int i=2;i<num;i++)
			{
				int counter=0;
			 for(int j=2;j<=i;j++)
			 {
				 if(i%j==0)
				 {
					 counter++;
				 }
			}
						
				if(counter>1)
				{
					System.out.println(i + " is not a prime number.");
				}
				
				else 
				{
					System.out.println(i + " is a prime number.");
				}
					
				
			}
		}
		
	}


