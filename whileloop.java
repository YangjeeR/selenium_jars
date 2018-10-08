package javatutorial;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int sal[]= {10000,50000,20000,60000,80000};
		int i =0;
		int maxsal=0;
		while (i <5)
		{
			if(maxsal<sal[i])
			{
			maxsal=sal[i];
			}
			
			i++;
		}
		System.out.println(maxsal);*/
	whileloop obj=new whileloop();
	obj.factnum();

	}
	
	public void factnum()
	{
		int num=10;
		int i=1;
		int fact=1;
		while (i<=10)
		{
	     fact=fact * i;	
		 i++;
		 }
		 System.out.println("Factorial num of " + num +" is " + fact);
		}
		
		 
	}


