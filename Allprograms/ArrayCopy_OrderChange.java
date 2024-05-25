package BasicKnowledge;

import java.util.Arrays;

public class ArrayCopy_OrderChange 
{

	public static void main(String[] args) 
	{
		String name[] = new String[4];
		
		   name[0]  = "ravi";
		   name[1]  =  "kiran";
		   name[2]  =  "hari";
		   name[3]  =  "uday";
		   
		   String namecopy[] = new String[name.length];
		   
		   for(int i =0;i<name.length;i++)
		   {
			   namecopy[i]= name[i];
		   }
		   for(int i =0;i<namecopy.length/2;i++)
		   {
			   String temp = namecopy[i];
			   namecopy[i] = namecopy[namecopy.length -1 -i];
			   namecopy[namecopy.length -1 -i] = temp;
		   }
         System.out.println(Arrays.toString(name));
         System.out.println(Arrays.toString(namecopy));
	}

}
