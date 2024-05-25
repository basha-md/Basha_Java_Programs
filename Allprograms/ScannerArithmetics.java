package BasicKnowledge;

import java.util.Scanner;

public class ScannerArithmetics 
{

	 static void add(int x, int y)
	{
		int sum = x+y;
		System.out.println("Addition of x and y is: "+ sum);
	}
	static void sub(float x,float y)
	{
		float sub = x-y;
		System.out.println("Subtract of x and y: "+ sub);
	}
	static void multi(double x,double y)
	{
		double multi = x*y;
		System.out.println("multi of x and y is: "+ multi);
	}
	static void div(int a12, int a11)
	{
		int div = a12/a11;
		System.out.println("div of a and b is: "+ div);
	}
	
	static void mod(long x, long y)
	{
		long mod = x%y;
		System.out.println("mod of x and y is: "+ mod);
	}
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int a1 =  s1.nextInt();
		int a2 =  s1.nextInt();
		add(a1,a2);
		sub(a1,a2);
		multi(a1,a2);
		div(a1,a2);
		mod(a1,a2);
		s1.close();
	}

}
