package Array;

import java.util.Scanner;

public class one_array
{

	public static void main(String[] args)
	{
		
		int ar[]= new int[3];
		ar[0]=20;
		ar[1]=29;
		ar[2]=40;
		for(int k=0;k<=2;k++)
		{
			System.out.println(ar[k]);
		}
		
		
		int[] arr=new int[5];
		int i;
		
		System.out.println("Enter 5 numbers");
		Scanner reader=new Scanner(System.in);
		for(i=0;i<=4;i++)
		{
			arr[i]=reader.nextInt();
		}
		
		for(i=0;i<=4;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}

}
