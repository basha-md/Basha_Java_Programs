package BasicKnowledge;

abstract class Amazon_auth
{
	abstract void un();
	abstract void un_mob();
	void login_button()
	{
		System.out.println("logic");
	}
}
 abstract class Amazon2_logout extends Amazon_auth
 {
	 abstract void un_as_email();
		abstract void un_as_mob();
		void registration_button()
		{
		 System.out.println("logic 1");	
		}
 }

public class Concrete_Classes extends Amazon2_logout
{
   static void login_mob() {
}
   {
	 System.out.println("good");  
   }
   static void login_tab() {
}
   {
	  System.out.println("cool"); 
   }
   
	public static void main(String[] args) 
	{
		login_mob();
		login_tab();
		System.out.println("over");
		
	}

	@Override
	void un_as_email() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void un_as_mob() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void un() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void un_mob() {
		// TODO Auto-generated method stub
		
	}

}
