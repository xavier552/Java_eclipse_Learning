package programs;

public class palindrom
{

	public static void main(String[] args)
	{
		String s="amma";
		String temp="";
		for (int i = s.length()-1; i>=0;i--)
		{
			  temp = temp + s.charAt(i);
        }
		if(s.equals(temp)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}

}
