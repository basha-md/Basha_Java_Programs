package BasicKnowledge;

public class String_Matches_nameStart 
{

	public static void main(String[] args) 
	{
		String input = "Majito";
		
		System.out.println(input.matches("M(.*)"));//name starts with "m"
		System.out.println(input.matches("(.*)h"));//name ends with "h"
		
		String ip = "malik";
		
		System.out.println(ip.matches("....."));// checking for 5 letters word or not
		System.out.println(ip.matches("........"));

		String name = "Ayaan";
		System.out.println(name.repeat(10));
	}

}
