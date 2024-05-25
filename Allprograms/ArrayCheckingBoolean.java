package BasicKnowledge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCheckingBoolean 
{

	public static void main(String[] args) 
	{
		System.out.println("starting of first array--->");
		Scanner  s1 = new Scanner(System.in);
		boolean booleanArray[] = new boolean[3];
		
		for(int i=0;i<3;i++)
		{
		  System.out.println("Enter value for element" +(i+1) + " : ");
		  booleanArray[i] = s1.nextBoolean();
		}
		
		boolean booleanArray1[] = new boolean[3];
		for(int i=0;i<3;i++)
		{
		  System.out.println("Enter value for element" +(i+1) + " : ");
		booleanArray1[i] = s1.nextBoolean();
		}
		
		System.out.println(Arrays.equals(booleanArray,booleanArray1));
		
		
		  if (Arrays.equals(booleanArray, booleanArray1)== true)
		 {
			 System.out.println("both arrays are same");
		 }
		 else 
		 {
			 System.out.println("different arrays");
		 }
		
		

	}

}
