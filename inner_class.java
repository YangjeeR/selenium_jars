package javatutorial;

public class inner_class {
	
	void cal()
	{
		int num=80;
		
		class inner{
			public void dis()
			{
				System.out.println("The number is " + num);
			}
		}
		
		inner in=new inner();
		in.dis();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inner_class cls=new inner_class();
		cls.cal();
		System.out.println("Program ends");
	}

}
