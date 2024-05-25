package BasicKnowledge;

import java.util.Arrays;

public class ArrayCopy_ToAnotherArray 
{
 public static void main(String[] args) {
	 
	 String name[] = new String[4]; 
	 
	   name[0] = "Ram";
	   name[1] = "Lakshman";
	   name[2] = "Sita";
	   name[3] = "Hanuman";
	   
	   String namecopy[] = new String[name.length] ;
	   
	   for(int i=0;i<name.length;i++)
	   {
		  namecopy[i] = name[i]; 
	   }
	    System.out.println(Arrays.toString(name));
	    System.out.println(Arrays.toString(namecopy));
}
}
