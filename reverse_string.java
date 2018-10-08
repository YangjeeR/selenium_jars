package javatutorial;

public class reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String name="Yangjee";
        StringBuffer sbf=new StringBuffer(name);
        System.out.println("The reverse of string " + name +" is " + sbf.reverse());
        
        //iteration
       char[] strarray=name.toCharArray();
        char rev_name =0;
        for(int i=strarray.length-1;i>=0;i--)
        {
        	rev_name=strarray[i];
        }
        System.out.print("The reverse of string " + name +" is " + rev_name);
        
        System.out.println(recur("Yangjee"));
        
        reverse_string obj=new reverse_string();
        obj.max_sal();
      
	} 
        
        //recursion
        static String recur(String str)
        {
        	if(null==str || str.length()<=1)
        	{
        		return str;
        	}
        	 return recur(str.substring(1)) +  str.charAt(0);
        
	}
        
       public void max_sal()
       {
    	   
    	 int salary[]= {20000,80000,10000,40000};
    	 int max=0;
    	 
    	 for(int i=0;i<3;i++)
    	 {
    		 
    		 if(max<salary[i])
    		 {
    		max=salary[i];
    		 
    	 }
    		 
       }
    	 System.out.println("The maximum salary is " + max);

       }
       
    

}
