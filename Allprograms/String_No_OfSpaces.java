package BasicKnowledge;

import java.util.Arrays;

public class String_No_OfSpaces 
{
	static int countofspaces = 0;
	public static void main(String[] args) 
	{
		String name = "rahul kumar   chaudary123";
		 char [] c1 =  name.toCharArray();
		 
		 System.out.println(Arrays.toString(c1));
		 for(int i=0;i<c1.length;i++)
		 {
			
		 
		 boolean answer = Character.isSpaceChar(c1[i]);
		 if(answer == true)
		 {
			 countofspaces++;
		 }
		 }
		 System.out.println("no.of spaces are :" + countofspaces);

	}

}
