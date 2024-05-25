package BasicKnowledge;

public class GlobalVariable4 
{
	static int age;
	static double weight;
	String name="postman";
	

	public static void main(String[] args) 
	{
		System.out.println(age);
        System.out.println(weight);
     
        
        GlobalVariable4 g1 = new GlobalVariable4();
        g1.name="sachin";
           System.out.println(g1.name);
        

	}

}
