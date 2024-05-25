package BasicKnowledge;

public class OverLoadingMainMethod 
{

	public static void main(String[] args) 
	{
		System.out.println("1");
		main("mainish");
		main(20,30);
		main();
	}

	public static void main()
	{
		System.out.println("2");	
	}
	public static void main(int a,int b)
	{
		System.out.println("3");
	}
	public static void main(String name)
	{
		
		System.out.println("4");
		
	}
	
	
	
	
}
