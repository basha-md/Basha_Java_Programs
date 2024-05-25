package BasicKnowledge;

public class Widening2 
{

	public static void main(String[] args) 
	{
		
		byte age =42;
		long age1 =age; 
		age1= 1000;
		System.out.println(age1);

long age2 =1000;
		byte age3 =(byte) age2;
		System.out.println(age3);
		
		
		
		
		int age4 = 101;
		float age5 = age4;
		System.out.println(age5);

	
	
	
	}
}
