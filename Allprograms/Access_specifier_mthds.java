package BasicKnowledge;

public class Access_specifier_mthds 
{

	public void add()
	{
		System.out.println("1");
	}
	private void sub()
	{
		System.out.println("2");	
	}
	protected void multi()
	{
		System.out.println("3");	
	}
	void div()
	{
		System.out.println("4");	
	}
	
	/*public static void main(String[] args) 
	{
		System.out.println("5");
		Access_specifier_mthds a1 = new Access_specifier_mthds();
		a1.add();
		a1.sub();
		a1.multi();
		a1.div();

	}
*/
}
