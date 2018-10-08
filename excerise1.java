package javatutorial;

public class excerise1 {


	
public void exer()
{
	int i,j;
	for(i=0;i<=5;i++)
	{
		for(j=1;j<=1+i;j++)
			System.out.print("*");
		System.out.println("");

	}
}
public void num()
{
	int i,j,k;
	for(i=1;i<=7;i++)
	{
		for(j=1;j<=i;++j)
			System.out.print(j);
			
		{
			for(k=7-i;k>=1;k--)
				System.out.print("*");
			System.out.println("");
		}
	}
}
public void num1()
{
	int i,j,k;
	 for ( i = 7; i >= 1; i--) 
     {
         for ( j = 1; j <= i; j++)
         {
			System.out.print(j);
         }
			
				for(k=0;k<=7-i;k++)
				{
				System.out.print("*");
				
			}
			
				System.out.println("");
		
	}
}

public void num2()
{
	int i,j;
	
	for(i=1;i<=7;i++)
	{
		for(j=7;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println("");
	}
}
/*7
76
765
7654
76543
765432
7654321
*/

public void num3()
{
	int i,j;
	for(i=7;i>=1;i--)
	{
		for(j=7;j>=i;j--)
		{
			System.out.print(j);
			
		}
		System.out.println("");
		
	}
}
/*
7654321
654321
54321
4321
321
21
1
 */

public void num4()
{
	int i,j;
	for(i=7;i>=1;i--)
	{
		for(j=i;j>=1;j--)
		{
			System.out.print(j);
			
		}
		System.out.println("");
		
		
	}
}

/*
 * 1234567
123456
12345
1234
123
12
1
12
123
1234
12345
123456
1234567

 */
public void num5()
{
	int i,j;
	for(i=7;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
			
		}
		System.out.println("");
		
	}
	for(i=2;i<=7;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
			
		}
		System.out.println("");
		
	}
}
/*1
121
12321
1234321
123454321
12345654321
1234567654321
*/
public void num6()
{
	int i,j;
	for(i=1;i<=7;i++)
	{
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
			
		}
		for(j=i-1;j>=1;j--)
		{
			System.out.print(j);
			
		}
		System.out.println("");
		
		
	}
}
/*
 * 1
21
321
4321
54321
654321
7654321

 */

public void num7()
{
	int i,j;
	for(i=1;i<=7;i++)
	{
		for(j=i;j>=1;j--)
		{
			System.out.print(j);
			
		}
		System.out.println("");
		
		
	}
}

public void num8()
{
	int i,j;
	for(i=1;i<=7;i++)
	{
		for(j=1;j<i;j++)
		{
			System.out.print(j);
			
		}
		System.out.println("");
		
		
	}
	for(i=7-1;i>=1;i--)
	{
		for(j=i;j<=7;j++)
		{
			System.out.print(j);
			
		}
		System.out.println("");
		
		
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
/*int i,j;
for(i=0;i<=6;i++){
for(j=1;j<=7-i;j++) System.out.print("*");
System.out.println("");

}*/
excerise1 obj=new excerise1();
obj.num8();
}
}
