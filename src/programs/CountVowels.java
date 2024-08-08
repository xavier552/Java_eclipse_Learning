
package programs;
import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountVowels obj=new CountVowels();
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=reader.next().toLowerCase();
		System.out.println("Number of Vowels in "+word+" is "+(obj.checkVowelCount(word)));
		reader.close();
	}
	
	public int checkVowelCount(String word)
	{
		int Count=0;		
		for(int i=0;i<word.length();i++)
		{		
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				Count++;
				
			}
		}
		return Count;
		
	}

}
