package javatutorial;

public class fizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=50;i++)
		{
			if(i%(3*5)==0)
			{
				System.out.println(i+ "FizzBuzz");
			}
			else
				if(i%3==0)
				{
					System.out.println(i+  "Fizz");
				}
			if(i%5==0)
			{
				System.out.println(i+ "Buzz");
			}
				
		}

	}

}
