package javatutorial;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++)
		{	  
		 fact=fact*i;		
		}		
		System.out.println("The factorial of " + num + " is " + fact);

	fact obj=new fact();
	int a=obj.facto(num);
	System.out.println("The factorial of " + num + " is " + a);
}

}

class fact{

	int facto(int n)
	{
		int result;
	if(n==1)	
		return 1;
	result=facto(n-1)*n;
	return result;
	
	}
	
	
}