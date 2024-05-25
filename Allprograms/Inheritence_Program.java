package BasicKnowledge;

import Inherit.Parent1;

class Parent extends Parent1
{
	  void sub()
	{
		System.out.println("subtract");
		
	}
	  void multi()
	{
	 System.out.println("multiplication");	
	}
}


public class Inheritence_Program  

{
     static void add()
   {
	   System.out.println("one"); 
   }
	public static void main(String[] args)
	{
		Inheritence_Program I1 = new Inheritence_Program();
		add();
		I1.sub();
		I1.multi();
		
		
		
		
		

	}
	private void multi() {
		// TODO Auto-generated method stub
		
	}
	private void sub() {
		// TODO Auto-generated method stub
		
	}

}
