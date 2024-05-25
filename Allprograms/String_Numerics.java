package BasicKnowledge;

import java.util.Arrays;

public class String_Numerics 
{
	static int countofnumerics = 0;
	public static void main(String[] args) 
	{
		String name = "rahul123";
		 char [] c1 =  name.toCharArray();
		 
		 System.out.println(Arrays.toString(c1));
		 for(int i=0;i<c1.length;i++)
		 {
			
		 
		 boolean answer = Character.isDigit(c1[i]);
		 if(answer == true)
		 {
			 countofnumerics++;
		 }
		 }
		 System.out.println("no.of numerics are :" + countofnumerics);
		 }
		
		
		
	}


