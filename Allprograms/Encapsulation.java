package BasicKnowledge;

class Amazon_application
{
	private String un = "conatct@ipl.com";//updated to cdjc@ipl.com
	
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un = un;
	}
	
}

public class Encapsulation 
{
	
	public static void main(String[] args) 
	{
		Amazon_application a1 = new Amazon_application();
		a1.setUn("cdjc@ipl.com");
        System.out.println(a1.getUn());
	}

}
