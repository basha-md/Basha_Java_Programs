package BasicKnowledge;

import java.util.Scanner;

public class FinalVariableCircle 
{
   
	
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the radius: " );
		
		double radius = s1.nextDouble();
		
     System.out.println("area of the circle: " + Math.PI* radius * radius );
	}

}
