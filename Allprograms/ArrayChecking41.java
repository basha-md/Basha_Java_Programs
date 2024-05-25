package BasicKnowledge;

public class ArrayChecking41 
{

	public static void main(String[] args) 
	{
		int nos[] = new int [4];
		
		nos[0]  = 41;
		nos[1]  = 88;
		nos[2]  = 41;
		nos[3]  = 68;
		
       int givenno = 41;
       
       for(int i=0;i<nos.length;i++)
       {
    	   if(givenno==nos[i])
    	   {
    		   System.out.println("number is present in array");
    	   }
    	   else
    	   {
    		   System.out.println("number is not present in array");
    	   }
       }
	}

}
