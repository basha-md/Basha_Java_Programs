package BasicKnowledge;

import java.util.Scanner;

public class ScannerClass 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		   long number1   = s1.nextLong();
		   long number2 =  s1.nextLong();
		   
		   long sum =  number1 +  number2;
		   System.out.println("the sum of two numbers are-" + sum);
		   
		   
	}

}

