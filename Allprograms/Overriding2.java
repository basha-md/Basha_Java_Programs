package BasicKnowledge;

 class first
 {
	 void sub(int a)
	 {
		 System.out.println("yes");
	 }
 }
public class Overriding2 extends first
{
   void add()
   {
	   System.out.println("addition");
	   
	   //super.sub(200);
   }
	public static void main(String[] args) 
	{
		Overriding2 o1 = new Overriding2();
		o1.add();
		//o1.sub(20);
		
		first f1 = new first();
		f1.sub(100);
    
		System.out.println("hai");
	}

}
