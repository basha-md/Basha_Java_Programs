package BasicKnowledge;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAtRunTime 
{

	public static void main(String[] args) 
	{
		System.out.println("starting of first array--->");
		Scanner  s1 = new Scanner(System.in);
		int rollno[] = new int[3];
		
		for(int i=0;i<3;i++)
		{
		  System.out.println("Enter the Arrray -> "+ i);
		
		rollno[i] = s1.nextInt();
		System.out.println(rollno[i]);
		}
	System.out.println("starting of second array--->");	
int rollno1[] = new int[3];
		
		for(int i=0;i<3;i++)
		{
		  System.out.println("Enter the Arrray -> "+ i);
		rollno1[i] = s1.nextInt();
		System.out.println(rollno1[i]);
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		
		if (Arrays.equals(rollno, rollno1)== true)
		 {
			 System.out.println("both arrays are same");
		 }
		 else 
		 {
			 System.out.println("different arrays");
		 }
		}
		}
	



