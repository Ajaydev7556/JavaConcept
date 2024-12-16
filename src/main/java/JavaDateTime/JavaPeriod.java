package JavaDateTime;

import java.time.LocalDate;
import java.time.Period;

public class JavaPeriod {
	
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		LocalDate customDate = LocalDate.of(1998, 01, 18);
		
		Period period = Period.between(now, customDate);
		
		System.out.println("Difference between two dates : "+period);
		
		Period customPeriod = Period.of(20, 10, 15);
		
		System.out.println("\n\nCustom Period : "+customPeriod);
		
		System.out.println("\n\nGet months from period : "+period.getMonths());
		
	}

}
