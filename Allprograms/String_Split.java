package BasicKnowledge;

import java.util.Arrays;

public class String_Split 
{

	public static void main(String[] args) 
	{
		String a1 = "My name is Akhil";
		
		String arr[] = a1.split("is");
		
		System.out.println(Arrays.toString(arr));

	}

}
