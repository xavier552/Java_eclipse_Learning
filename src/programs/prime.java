package programs;

public class prime
{

	public static void main(String[] args) 
	{
		 int num = 8,flag=0;
		    for (int i = 2; i <= num / 2; ++i) 
		    {
		    	if (num % i == 0)
		    	{
		    		flag=1;
		    		break;
		      }
		    }

		    if (flag==0) {
		        System.out.println(num + " is a prime number.");
		    }
		  
		    else {
		      System.out.println(num + " is not a prime number.");
		    }
	}

}
