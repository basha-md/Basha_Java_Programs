package BasicKnowledge;

class college
{
	college(String college_name )
	{
		System.out.println("college");
	}
}
class school extends college
{
	school(int a,String b,double c)
	
	{ super("JYT");
		System.out.println("school");
	}
}

public class Supercalling_statement 
{

	public static void main(String[] args) 
	{
		school s1 = new school(100,"dad",22.32);
		//college c1 = new college("HYT");

	}

}
