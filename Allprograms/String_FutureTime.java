package BasicKnowledge;

import java.util.Date;

public class String_FutureTime {

	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime()+(60*60*1000*24*-5));
		//Date d3 = new Date(d1.getTime()+(60*60*1000*24*5));
		System.out.println(d2);
		

		String input = d1.toString();
		System.out.println(input);
		
		String month = input.substring(4, 7);
		System.out.println(month);
		
		String date = input.substring(8, 11);
		System.out.println(date);
		System.out.println(input.length());
		
		//String year = input.substring(24);
		String year1 = input.substring(input.length()-4);
		System.out.println(year1);
		
		System.out.println("==========");
		System.out.println(date.concat("  ").concat(month).concat("  ").concat(year1));
		System.out.println(date + (" ")+ month +(" ")+ year1);
		
		System.out.println(date.concat("-").concat(month).concat("-").concat(year1));
		System.out.println(date.concat("/").concat(month).concat("/").concat(year1));
		
	}

}
	


