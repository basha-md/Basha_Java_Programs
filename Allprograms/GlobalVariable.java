package BasicKnowledge;

public class GlobalVariable 
{
   static int age=50;
   static String name;
   
  static void add()
   {
	   System.out.println(age);
   }
	
	
	public static void main(String[] args)
	{
	   age=100;
		
		System.out.println(age);
       name = "MKT";
       System.out.println(name);
	}
     
}
