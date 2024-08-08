package Learning_java;

import java.util.Scanner;

public class Scanner_reader
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num1,num2,sum=0;
		System.out.println("Enter a number: num1 ");
		num1=sc.nextInt();
		System.out.println("Enter a number: num2 ");
		num2=sc.nextInt();
		sum=num1+num2;
		System.out.println("sum is : "+sum);
		sc.close();
		

	}

}
