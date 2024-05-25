package BasicKnowledge;

public class Constructor_Ash {

	Constructor_Ash()
{
		
		System.out.println("iam a constructor");
	}
	
	Constructor_Ash(int a)
	{
		System.out.println("1");
	}
	
	Constructor_Ash(int a,double b)
	{
		System.out.println(a+b+5.25);
	}
	

	Constructor_Ash(String a,double b, boolean d, int i,char e,long f ,char g)
	{
		System.out.println(5);
	}
	
	void add()
	{
		System.out.println("non-static method");
		
	}
	 static void sub()
	 {
		 System.out.println("static method");
		  
	 }
	
	public static void main(String[] args) {
		sub();
		new Constructor_Ash();
		//new Constructor_Ash(1);
		
		 Constructor_Ash n1 = new Constructor_Ash(2,2.5);
		 Constructor_Ash n2 = new Constructor_Ash("ggh",3.19,true,888,'x',65555,'s');
		Constructor_Ash a1 = new Constructor_Ash();
            a1.add();
          //  a1.sub();
	}

}
