package BasicKnowledge;

public class OrWithAnd 
{

	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		/*if(!(a<b || b!=a))
				{
			System.out.println("not with or operator");
				}*/

		if(!(a>=b && b==a))
		{
			System.out.println("not with and operator");
		}
	}

}
