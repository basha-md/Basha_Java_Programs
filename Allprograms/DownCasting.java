package BasicKnowledge;

class Parentclassone
{
	
}


public class DownCasting extends Parentclassone
{

	public static void main(String[] args) 
	{
		Parentclassone p1 =  new DownCasting();// upcasting-implicit
		
		Parentclassone p2 =  (Parentclassone )new DownCasting(); //upcasting-explicit
		
		DownCasting D1 = (DownCasting) p1;// downcasting 

	}

}
