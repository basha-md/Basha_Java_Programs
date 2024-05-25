package BasicKnowledge;

public class String_functions 
{

	public static void main(String[] args) 
	{
		String name= "School win";
		System.out.println(name.length());
		System.out.println(name.charAt(1));
		System.out.println(name.indexOf('w'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat("name is ABC pulic school"));
		String first_name= "Ashraf" ;
		String last_name = "Basha";
		System.out.println(first_name.concat(last_name));
		System.out.println(first_name.concat("  ").concat(last_name ));
		System.out.println(name.contains("sch"));
		System.out.println(name.contains("Sch"));
		System.out.println(name.contains("win"));
	}

}
