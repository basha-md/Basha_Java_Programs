package BasicKnowledge;

class Grand_parent
{
	static void add()
	{
		
	
		 System.out.println("one");
	}
	 
}
class Parent_Class extends Grand_parent
{
	static void sub()
	{
		System.out.println("two");
	}
}
public class Multi_Inheritence extends Parent_Class
{
  static void mul()
  {
	  System.out.println("three");
  }
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		System.out.println("four");
	}

}
