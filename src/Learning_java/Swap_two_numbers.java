package Learning_java;

public class Swap_two_numbers
{

	public static void main(String[] args)
	{
		int num1=30,num2=40,temp=0;
		System.out.println("num1 ="+num1+" "+"num2 = "+num2);
		System.out.println("Before Swapping first number= "+num1);
		System.out.println("Before Swapping second number= "+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("\nAfter Swapping first number= "+num1);
		System.out.println("After Swapping second number= "+num2);
		
		//without temp variable
		System.out.println("\nwithout temp variable");
		System.out.println("num1 ="+num1+" "+"num2 = "+num2);
		System.out.println("Before Swapping first number= "+num1);
		System.out.println("Before Swapping second number= "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("\nAfter Swapping first number= "+num1);
		System.out.println("After Swapping second number= "+num2);
	}

}
