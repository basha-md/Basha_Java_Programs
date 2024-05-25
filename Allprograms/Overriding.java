package BasicKnowledge;

class Parent extends Inherit1
{
	 void login()
	{
		System.out.println("login with mobile no.");
	}
}


public class Overriding extends Parent
{
     void logout()
    {
    	System.out.println("login with email id");
    	//super.login();
    }
	public static void main(String[] args) 
	{
		Overriding o1 = new Overriding();
				o1.logout();
				///I1.div();
				add();
		
	}

}
