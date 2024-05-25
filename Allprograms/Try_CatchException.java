package BasicKnowledge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_CatchException 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		try {
		
		int age = s1.nextInt();
		System.out.println(age);
		}
		
		catch(InputMismatchException a1) 
		{
		 System.out.println("Handed the exception");
		}
		
	
		
	}

}
