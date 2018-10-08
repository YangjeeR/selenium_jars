package javatutorial;

public class string_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words={"Sunita","Anita","Himsikha","Anil"};
		//enhanced for loop
		for(String w:words)
		{
			if(w.startsWith("An"))
					{
				System.out.println(w + " starts with An");
				
					}
		}
		
		for(String w:words)
		{
			if(w.endsWith("ta"))
					{
				System.out.println(w + " ends with ta");
				
					}
		}
		
		//get index of string
		
		String w="TheendsendsThe";
		
		System.out.println(w.indexOf("e"));//2 gives position of first 'e' and count starts with 0,1,2
		System.out.println(w.indexOf("e",5));//count start leaving 5 letters
		
		//concat
		String w1="Yangjee";
		String w2=" Rai";
		System.out.println(w1+w2);
		System.out.println(w1.concat(w2));
		
		//replace
		System.out.println(w2.replace("Rai","Shrestha"));
		System.out.println(w1.toLowerCase());
		System.out.println(w2.toUpperCase());
		System.out.println(w2.trim());
	}

}
