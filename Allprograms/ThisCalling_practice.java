package BasicKnowledge;

public class ThisCalling_practice 
{
	 ThisCalling_practice()
	{ //this(2.25);
		System.out.println("1");
	}
	ThisCalling_practice(int a)
	{ this(1.1);
	 System.out.println("2");	
	}
	ThisCalling_practice(double a)
	{ this();
	 System.out.println("3");	
	}
	
	
	
	public static void main(String[] args) 
	{
		ThisCalling_practice c = new ThisCalling_practice(3);

	}

}
