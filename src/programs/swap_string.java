package programs;

public class swap_string 
{

	public static void main(String[] args) 
	{
		String s1= "xavier";
		String s2= "varghese";
	System.out.println("s1="+s1);
	System.out.println("s2="+s2);
System.out.println("\nafer swap");
	s1=s1+s2;
	s2=s1.substring(0,s1.length()-s2.length());
	s1=s1.substring(s2.length());
	System.out.println("\ns2="+s2);
	System.out.println("s1="+s1);
	}

}
