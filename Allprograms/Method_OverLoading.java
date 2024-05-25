package BasicKnowledge;

public class Method_OverLoading
{
	Method_OverLoading()
	{
		System.out.println("iam a constructor");
		
	}
	void add()
	{
		int a=100;
		System.out.println(a+6);
	}
	void add(int a)
	{
		System.out.println(a+6);
	}
	
	void add(int a,long b,int c)
	{
		System.out.println(a+b+c);
	}
	static void add(double a,int b)
	{
		System.out.println(a+b+5);
	}
	void add(int a,long b,int c,long d)
	{
		System.out.println(a+b+c+d);
	}
	public static void main(String[] args) 
	{
		add(2.25,100);
		new Method_OverLoading();
	  Method_OverLoading m1 = new Method_OverLoading();
	  m1.add();
	  m1.add(200);
	  m1.add(200,100,300);
	  m1.add(1000,2000,3000,4000);
	  
	 
		
		
	}

}
