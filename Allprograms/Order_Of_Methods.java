package BasicKnowledge;

public class Order_Of_Methods 
{
	{
		System.out.println("IIB");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method");
		Order_Of_Methods o1 = new Order_Of_Methods();
		Order_Of_Methods o2 = new Order_Of_Methods();
		
	}
	 Order_Of_Methods()
	{
		System.out.println("constructor");
		
	}
	 static
	 {
		 System.out.println("SIB"); 
		
	 }
}
