package BasicKnowledge;

public class This_keyword_global 
{
   int age;
   String name;
   double salary;
   void student_details(int age,String name,double salary)
   {
	 //System.out.println("Name of the student is " + name + " Age of the student is " + age + " Salary of the student is " + salary);
	  this.age= age;
	   this.name= name;
	   this.salary = salary;
	   
   }
	
	public static void main(String[] args)
	{
		This_keyword_global t1 = new This_keyword_global();
		t1.student_details(20, "karan", 50000);
		System.out.println(t1.age);
		System.out.println(t1.name);
		System.out.println(t1.salary);
		//t1.student_details(20, "karan", 50000);
	}

}
