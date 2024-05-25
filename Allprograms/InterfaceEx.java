package BasicKnowledge;

interface Keybaoard
{
	void login();
	
}
public class InterfaceEx implements Keybaoard
{

	public static void main(String[] args) 
	{
		
    System.out.println("login with mobile");
	}

	@Override
	public void login() {
		System.out.println("okk");
		
	}

}
