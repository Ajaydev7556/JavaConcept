package JavaDateTime;

import java.time.Instant;
import java.time.ZoneId;

public class JavaInstant {
	
	public static void main(String[] args) {
		
		// Java old approach to get milliseconds 
		long currentTimeMilliseconds = System.currentTimeMillis();
		System.out.println("CurrentTime Milliseconds : "+currentTimeMilliseconds);
		
		
		Instant now = Instant.now();
		
		System.out.println("\n\nInstant : "+now);
		
		System.out.println("\n\nGet Epoch Seconds : "+now.getEpochSecond());
		
		
		System.out.println("\n\nGet Time with Zone : "+now.atZone(ZoneId.of("Israel")));
	}

}
