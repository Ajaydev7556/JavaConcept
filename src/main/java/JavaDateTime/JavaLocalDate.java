package JavaDateTime;

import java.time.LocalDate;

public class JavaLocalDate {
	
	public static void main(String[] args) {
		
	LocalDate date = LocalDate.now();
	
	System.out.println("Print Local Date : "+date);
	
	System.out.println("\n\nPrint Year of LocalDate : "+date.getYear());
		
	System.out.println("\n\nPrint Month Name of LocalDate : "+date.getMonth());
	
	System.out.println("\n\nPrint Month Value of LocalDate : "+date.getMonthValue());
	
	System.out.println("\n\nPrint Day of LocalDate : "+date.getDayOfMonth());
	
	
	System.out.println("\n\nPrint Custom Date");
	
	LocalDate customDate = LocalDate.of(1998, 1, 18);
	
	System.out.println(customDate);
	
	System.out.println("\n\nPrint Yesterday : "+date.minusDays(1));
	
	System.out.println("\n\nPrint Date of previous Week : "+date.minusDays(7));
	
	System.out.println("\n\nPrint Date of previous 10 months : "+date.minusMonths(10));
	
	LocalDate parse = LocalDate.parse("2012-07-25");
	
	System.out.println("\nParse Date : "+parse);
	}

}
