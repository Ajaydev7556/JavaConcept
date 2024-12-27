package JavaDateTime;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateTimeFormatter {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		// Custom Format 1
		DateTimeFormatter myFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String format1 = localDate.format(myFormatter1);
		
		System.out.println("Date with Custom formatter (1) : "+format1);
		
		
		// Custom Format 2
		DateTimeFormatter myFormatter2 = DateTimeFormatter.ofPattern("dd MMM yyyy");
		
		String format2 = localDate.format(myFormatter2);
		
		System.out.println("\n\nDate with Custom formatter (2) : "+format2);
		
		
		// Custom Format 3
		DateTimeFormatter myFormatter3 = DateTimeFormatter.ofPattern("dd MMMM yyyy");
		
		String format3 = localDate.format(myFormatter3);
		
		System.out.println("\n\nDate with Custom formatter (3) : "+format3);
		
		
		// String data convert to Date
		String date1 = "18/01/2000";
		
		DateTimeFormatter myFormatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate parse = LocalDate.parse(date1, myFormatter4);
		
		System.out.println("\n\nString data "+date1+" into Date (Parse) : "+parse);
		
		
		// String data convert to Date
		String date2 = "18/01/2000 10:30:45 IST";
		
		DateTimeFormatter myFormatter5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z");
		
		ZonedDateTime parse2 = ZonedDateTime.parse(date2, myFormatter5);
		
		System.out.println("\n\nString data ("+date2+") into Date (Parse) : "+parse2);
		
		
		
		// String data convert to Date
		String date3 = "18/01/2000 10:30:45+05:30";
		
		DateTimeFormatter myFormatter6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ssXXX");
		
		ZonedDateTime parse3 = ZonedDateTime.parse(date3, myFormatter6);
		
		System.out.println("\n\nString data ("+date3+") into Date (Parse) : "+parse3);
	}

}
