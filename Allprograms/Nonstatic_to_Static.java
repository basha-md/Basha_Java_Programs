package BasicKnowledge;

public class Nonstatic_to_Static {
	
	void add()
	{
		int a=100;
		int b=200;
		System.out.println(a+b);
	}
	
	void sub()
	{
	int a = 200;
	int b = 400;
	System.out.println(a-b);

	}
	static void multi()
	{
		int a = 100;
		int b = 300;
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		multi();

		Nonstatic_to_Static n1 = new Nonstatic_to_Static();
		      n1.add();
		      n1.sub();

	}

}
