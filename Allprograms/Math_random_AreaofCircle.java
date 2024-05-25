package BasicKnowledge;

public class Math_random_AreaofCircle 
{

	public static void main(String[] args)
	{
		
		   for(int i=1;i<=10;i++)
		{
		  Double pi=Math.PI;
		  Double r=Math.random();//radius
		  Double area=pi*r*r;//area of Circle 
		  System.out.println("area of the circle is "+ area);
		 
			  /* double a = Math.random();
			   System.out.println("Radius of the circle ="+a);
			   System.out.println("Area of the circle= "+ (Math.PI*a*a));
			   */
		 
		}
		
	}
}
