package BasicKnowledge;

import java.util.Scanner;

public class ScannerMethods 
{
   
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the X value:" );
		int a1=s1.nextInt();
		System.out.println("Enter the Y value:" );
		int a2=s1.nextInt();
		int sub=a1-a2;
		System.out.println("subtraction value:" +sub);
	s1.close();
	}
	{
		Scanner s3 = new Scanner(System.in);
		    System.out.println("enter the a value ");
		    int a1 = s3.nextInt();
		    System.out.println("enter the b value ");
		    int a2 = s3.nextInt();
		    int sum = a1+a2;
		    System.out.println("sum of a nd b is: "+ sum);
		    s3.close();
	}
	{
	
	    Scanner s2 = new Scanner(System.in);
	     System.out.println("enter the a value: ");
	     float c1 = s2.nextFloat();
	     System.out.println("enter the b value: ");
	     float c2 = s2.nextFloat();
	     float mul = c1*c2;
	     System.out.println("mulof a nd b value "+ mul);
	     s2.close();
	}

		}



         

