package BasicKnowledge;

public class Array1 
{

	public static void main(String[] args) 
	{
	
		String names[] = new String[3];
		
		names[0] = "Akhil";
		names[1] = "Kalyan";
		names[2] = "Raju";
      
		
			//System.out.println(names[i]);
		int rollno[] = new int[3];
		 rollno[0] =  77;
		 rollno[1] =  85;
		 rollno[2] =  64;
		
		char gender[] = new char[3];
		 gender[0] =  'M';
		 gender[1] =  'F';
		 gender[2] =  'F';
		 	 
	     System.out.println("student names" + " " + " roll no" +"  " + "gender");
			 
		 for(int i=0;i<3;i++)
			 {
		 System.out.println(names[i] + "            "+ rollno[i] + "      " + gender[i]);
			 }
		 }
	}


