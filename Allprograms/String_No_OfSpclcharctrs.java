package BasicKnowledge;

import java.util.Arrays;

public class String_No_OfSpclcharctrs 
{
   static int countofspclchrctrs = 0;
   static int countofalpha = 0;
   static int countofnumerics = 0;
   static int countofspaces = 0;
   
	public static void main(String[] args) 
	{
		String name = "hardik1234@#$  ";
		System.out.println(name.length());
		
		
		char[] c1 = name.toCharArray();
		   
		   System.out.println(Arrays.toString(c1));
		   for(int i=0;i<name.length();i++)
		   {
			  
			  boolean answer = Character.isAlphabetic(c1[i]);
			  if(answer == true)
			  {
				  countofalpha++;
			  }
			  
			  boolean answer1 = Character.isDigit(c1[i]);
			  if(answer1 == true)
			  {
				  countofnumerics++;
			  }
			  boolean answer2 = Character.isSpaceChar(c1[i]);
			  if(answer2 == true)
			  {
				  countofspaces++;
			  }
			  
		   }
		   System.out.println("total no. of alphabets : " + countofalpha );
		   System.out.println("total no. of numerics : " + countofnumerics );
		   System.out.println("total no. of spaces : " + countofspaces );  
			  
		   
		   int Totalcount = countofalpha +countofnumerics + countofspaces;
		      System.out.println("countofalpha +countofnumerics + countofspaces: " + Totalcount );
		      
		      countofspclchrctrs = name.length() - Totalcount;
		      
		      System.out.println("countofspcl characters: " +  countofspclchrctrs );
	
		   }
	
}
	


