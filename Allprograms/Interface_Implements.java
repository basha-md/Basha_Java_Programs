package BasicKnowledge;

interface Parent2 
{
	void mail();
	void pswrd();
	
}

public class Interface_Implements implements Parent2 

{
   void kit()
   {
	   
   }
   void pay()
   {
	   
   }
   
	public static void main(String[] args) 
	{
		Interface_Implements a1 = new Interface_Implements();
		//Assignment16 a1 = new Assignment16();
		a1.mail();
		a1.pswrd();
		System.out.println("yes");

	}

	@Override
	public void mail() {
		System.out.println("no");
		
	}

	@Override
	public void pswrd() {
		System.out.println("pot");
		
	}

}
