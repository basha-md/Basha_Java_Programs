package BasicKnowledge;
 
class grandparent
{
	grandparent(int a,int b)
	{
		super();
		System.out.println("grandparent");
	}
}

class parent3 extends grandparent
{
	parent3(int a)
	{
		super(100,1000);
		System.out.println("parent3");
	}
}

public class Mult_Constructors_Inherit extends parent3
{
	Mult_Constructors_Inherit() 
	{
		super(100);
		System.out.println("multi");
	}
	

	public static void main(String[] args) 
	{
		new Mult_Constructors_Inherit();

	}

}
