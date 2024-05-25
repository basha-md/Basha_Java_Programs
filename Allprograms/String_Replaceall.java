package BasicKnowledge;

public class String_Replaceall 
{

	public static void main(String[] args) 
	{
		String name = "School1234";
		
		String output = name.replaceAll("[a-z]", "" );
		
		System.out.println(output);

		
		String ip = "college123";
		
		String output2 = ip.replaceAll("[1-9]", "");
		
		System.out.println(output2);
	}

}
