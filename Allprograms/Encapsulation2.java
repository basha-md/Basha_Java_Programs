package BasicKnowledge;

class Flipkart_login
{
	private String un = "aadhar number";//updated to portal number

	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
		this.un = un;
	}
}

public class Encapsulation2 
{

	public static void main(String[] args)
{
		Flipkart_login f1 = new Flipkart_login();
		f1.setUn("portal number");
		System.out.println(f1.getUn());
		}

}
