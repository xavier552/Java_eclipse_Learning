package programs;

public class string_reverse 
{

	public static void main(String[] args)
	{

		 String s = "xavier";  
	        String s1 = "";    
	    
	        for(int i = s.length()-1; i >= 0; i--)
	        {    
	            s1 = s1 + s.charAt(i);    
	        }    
	            
	      
	        System.out.println("Reverse= " + s1); 
	}

}
