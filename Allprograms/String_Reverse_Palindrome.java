package BasicKnowledge;

public class String_Reverse_Palindrome
{

	public static void main(String[] args)
	{
		String input = "radar";
		String reverse = "";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			char op = input.charAt(i);
			reverse = reverse + op;
		}
			System.out.println(reverse);
		
         if(input.equals(reverse))
         {
        	 System.out.println("its a palindrome");
         }
         else
         {
        	 System.out.println("its not a palindrome");
         }
	}

}
