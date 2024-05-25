package BasicKnowledge;

interface switchboard
{
	void login();
	void logout();
}
interface switchboard1 extends switchboard
{
	void search();
	void payment();
	
}

public class Interface2 implements switchboard1,switchboard
{
   void order_page()
   {
	   
   }	
   static void address_page()
   {
	   
   }
	public static void main(String[] args) 
	{
		Interface2 I1 = new Interface2();
		  I1.order_page();
		  address_page();
		  I1.login();
		  I1.logout();
		  I1.search();
		  I1.payment();
		  System.out.println("okay cool");

	}
	@Override
	public void login() {
		System.out.println("look");
		
	}
	@Override
	public void logout() {
		System.out.println("best");
		
	}
	@Override
	public void search() {
		System.out.println("jar");
		
	}
	@Override
	public void payment() {
		System.out.println("ohh");
		
	}

}
