package JavaDateTime;

import java.time.Instant;

public class JavaInstant {
	
	public static void main(String[] args) {
		
		// Java old approach to get milliseconds 
		long currentTimeMilliseconds = System.currentTimeMillis();
		System.out.println("CurrentTime Milliseconds : "+currentTimeMilliseconds);
		
		
		Instant now = Instant.now();
		
		System.out.println("\n\nInstant : "+now);
	}

}
