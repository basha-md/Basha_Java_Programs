package BasicKnowledge;

class Parentclass
{
	
}

public class TypeUpCasting extends Parentclass
{

	public static void main(String[] args) 
	{
		Parentclass p1 = new TypeUpCasting();//upcasting-implicit way
		
		
		Parentclass p2 = (Parentclass ) new TypeUpCasting();//upcasting -explicit way

	}

}
