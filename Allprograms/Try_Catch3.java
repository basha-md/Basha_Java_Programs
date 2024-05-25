package BasicKnowledge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch3 
{

	public static void main(String[] args) 
	{
		try {
		Scanner s1=new Scanner(System.in);
		int n1=s1.nextInt();
	
		 String name[]=new String[3];
	     name[0]="ram";
		 name[1]="sita";
		 name[2]="laxman";
		 name[3]="shiva";
		}

		catch(InputMismatchException a1)
		{
			
		}
		
		
		catch(ArrayIndexOutOfBoundsException a2)
		{
			
		}
		try {
		String str = null;
		 System.out.println("ok");
		 System.out.println(str.length());
		}
		catch(NullPointerException a3)
		{
			
		}
		
	}

}
