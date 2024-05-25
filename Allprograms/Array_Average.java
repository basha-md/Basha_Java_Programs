package BasicKnowledge;

public class Array_Average 
{
    static double average = 0;
	static int sum = 0;
	static int reminder =0;
	public static void main(String[] args) 
	{
		int number[] = new int[4];
		number[0] = 10;
		number[1] = 20;
		number[2] = 30;
		number[3] = 140;
		
		for(int i=0;i<number.length;i++)
		{
			sum = sum + number[i];
			average = sum/number.length;
			reminder = sum%number.length;
		}
		System.out.println(sum);
		System.out.println(average);
		System.out.println(reminder);

	}

}
