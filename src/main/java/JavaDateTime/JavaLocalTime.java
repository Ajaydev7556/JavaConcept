package JavaDateTime;

import java.time.LocalTime;

public class JavaLocalTime {

	
	public static void main(String[] args) {
		
		LocalTime now = LocalTime.now();
		
		System.out.println("Local Time : "+now);
		
		LocalTime customTime = LocalTime.of(19,30, 20);
		
		System.out.println("\n\nCustomTime : "+customTime);
		
		System.out.println("\n\nTime before 2 Hours : "+customTime.minusHours(2));
		
		System.out.println("\n\nTime before 30 Minutes : "+customTime.minusMinutes(30));
		
		if(customTime.isAfter(now))
		{
			System.out.println("\nCustomTime isAfter : true");
		}
		
		else
		{
			System.out.println("\nCustomTime isAfter : false");
		}
		
		LocalTime parse = LocalTime.parse("15:35:25");
		
		System.out.println("\nParse Time : "+parse);
		
	}
}
