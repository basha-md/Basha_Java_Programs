package BasicKnowledge;

interface gmail
{
	void inbox();
	void sent();
}
interface youtube
{
	void play();
	void later();
}

public class InterfaceEx3 implements gmail,youtube,switchboard1
{

	public static void main(String[] args) 
	{
		InterfaceEx3 e1 = new InterfaceEx3();
		e1.inbox();
		e1.sent();
		e1.play();
		e1.later();
		e1.login();
		  e1.logout();
		  e1.search();
		  e1.payment();
		
		
		System.out.println("time out");
		
		
		

	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void later() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inbox() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
	}

}
