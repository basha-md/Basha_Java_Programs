package BasicKnowledge;

import java.util.Arrays;

public class Array_Anogram 
{

	public static void main(String[] args)
	{
		String input1 = "bread";
		String input2 =  "thampi";
		
		       char[] c1 = input1.toCharArray();
		       char[] c2 = input2.toCharArray();
		       
      System.out.println(Arrays.toString(c1));
      System.out.println(Arrays.toString(c2));
      
      System.out.println("====");
      Arrays.sort(c1);
      Arrays.sort(c2);
      
      System.out.println(Arrays.toString(c1));
      System.out.println(Arrays.toString(c2));
      
      if(Arrays.equals(c1, c2)== true)
      {
    	  System.out.println("they are anogram");
      }
      else
      {
    	  System.out.println("not a anogram");
      }
	}

}
