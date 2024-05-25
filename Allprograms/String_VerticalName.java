package BasicKnowledge;

public class String_VerticalName 
{

	static void reverse_vertical_name()
	{
		String input = "akhil";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char a1 = input.charAt(i);
			System.out.println(a1);
		}
	}
	
	public static void main(String[] args) 
	{
		reverse_vertical_name();
		System.out.println("------------");
		String input = "akhil";
		
		
		/*char a1 = input.charAt(0);
		System.out.println(a1);
		
		char a2 = input.charAt(1);
		System.out.println(a2);
		*/
		
		for(int i=0;i<input.length();i++)
		{
		char a1 = input.charAt(i);
		System.out.println(a1);
		}
	}

}
