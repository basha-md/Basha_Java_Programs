package BasicKnowledge;

import java.util.Scanner;

public class Sumof4numbers 
{
   static int sum =0;
	public static void main(String[] args) 
	{
		int number[] = new int[4];
		 number[0]  = 10;
		 number[1]  = 20;
		 number[2]  = 30;
		 number[3]  = 40;
		 
		 for(int i=0;i<number.length;i++)
		 {
			 sum = sum+number[i];
			 
		 }
		 //double pi = Math.PI;
		 System.out.println(Math.addExact(10,20 ));
		 
		 int a =100;
		 int b =200;
		 int c =300;
		 int d =400;
		 System.out.println(a+b+c+d);
		 System.out.println(sum);
		 
		 Scanner s1 = new Scanner(System.in);
		        int number1  =   s1.nextInt();
		        int number2  =   s1.nextInt();
		        
		        int sum = number1 +  number2;
		        System.out.println("sum of two numbers:" + sum);
	}

}
