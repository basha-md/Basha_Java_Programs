package BasicKnowledge;

public class Widening1
{

	public static void main(String[] args)
	{
		double a =90.21;
        
		System.out.println(a);
		
		int age = 100;
		    double ageofperson =   age;
		    System.out.println(ageofperson);//implicit -widening
		    
		    double ageofperson1 = (double)  age;
		    System.out.println(ageofperson1);//explicit -widening
		    
//============================

		    double pi = 3.14;
		   		     
		   	 int pinewvalue =(int) pi;
		   		              
		    System.out.println(pinewvalue);
		    
	}

}
