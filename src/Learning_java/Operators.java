package Learning_java;

public class Operators
{

	public static void main(String[] args)
	{
				// Operators
				int num1=20,num2=10;
				//Arithmetic
				System.out.println("ARITHEMATIC\n");
				System.out.println("num1 = "+num1 +" "  +"num2 = "+num2);
				System.out.println("Addition >>"+(num1+num2));
				System.out.println("Subtraction >>"+(num1-num2));
				System.out.println("Multiplication >> "+(num1*num2));
				System.out.println("Division >>"+(num1/num2));
				System.out.println("Modulus	>> "+(num1%num2));
				
			
				//Assignment 
				System.out.println("\nASSIGNMENT");
				System.out.println("num1 = "+num1 +" "  +"num2 = "+num2);

				System.out.println("num1+=num2");
				System.out.println(num1+=num2);
				System.out.println("num1 = "+num1);
				System.out.println("num1-=num2");
				System.out.println(num1-=num2);
				
				//Relational
				System.out.println("\nRELATIONAL");
				int R1=10,R2=20;
				System.out.println("R1 = "+R1+" "+"R2 = "+R2);
				System.out.println(R1==R2);
				System.out.println(R1>R2);
				System.out.println(R1<R2);
				
				//Logical
				System.out.println("\nLOGICAL");
				System.out.println((R1<R2)&&(num1==num2));
				System.out.println((R1<R2)&&(num1!=num2));
				System.out.println((num1<num2) ||(R1<R2) );
				System.out.println((R1<R2) || (num1==num2));
				System.out.println(((num1>num2 && R1<R2) || (num1==20 && R2==20)));
				
				//Unary
				System.out.println("\nUNARY");
				int A=10,B=15;
				System.out.println("A ="+A+" "+"B = "+B);
				System.out.println(A++);
				System.out.println("A++ ="+A);
				System.out.println(++A);
				System.out.println("++A ="+A);
				System.out.println("B--="+B--);
				System.out.println("--B="+--B);
				
				//Ternary
				System.out.println("\nTERNARY");
				System.out.println("R1 = "+R1+" "+"R2 = "+R2);

				String answer=R1>R2?"R1 is greater":"R2 is greater";
				System.out.println(answer);
	}

}
