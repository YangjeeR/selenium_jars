package javatutorial;

public class maxsal {
	
	public void salary()
	
	{
		
		int sal[]= {10000,60000,20000,80000,300000};
		int i=0;
		int maxsal=0;
		
		for(i=0;i<5;i++)
		{
			if(maxsal<sal[i])
			{
				maxsal=sal[i];
			}
		}
		System.out.print("Maximum Salary:" + maxsal);
	}

}
