package Learning_java;

import java.util.Scanner;

public class Simple_calculator
{

	public static void main(String[] args)
	{

		double num1,num2;
		int count;
		Scanner sc=new Scanner(System.in);
		do
		{
				System.out.println("Select the operator (+ - * / %)");
				char C=sc.next().charAt(0);
				System.out.println("Enter two numbers : ");
			    num1=sc.nextDouble();
			    num2=sc.nextDouble();
			    
				
				switch(C)
				{
						case '+': System.out.println("Addition Result :"+(num1+num2));
						          break;
						case '-': System.out.println("Subtraction Result :"+(num1-num2));
									break;
						case '*': System.out.println("Multiplication Result :"+(num1*num2));
				        			break;
						case '/': System.out.println("Division Result :"+(num1/num2));
				        			break;
						case '%': System.out.println("Modulus Result :"+(num1%num2));
				        			break;
				}
				System.out.println("Do you want to exit? Select (0 or 1)");
				count=sc.nextInt();
				}while(count!=0);
		
		System.out.println("------End of program-----");
		sc.close();
	}
	
}

