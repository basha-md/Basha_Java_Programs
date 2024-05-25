package BasicKnowledge;

 class StudentClass
 {
	 StudentClass(int a)
	 {
		 System.out.println("small constructor"); 
	 }
	
 }

public class InvokingConstructor 
  
{
	
	InvokingConstructor()
	{
		System.out.println("InvokingConstructor");
	}
	public static void main(String[] args) 
	{
		new StudentClass(100);
		new InvokingConstructor();
	}
  
}
