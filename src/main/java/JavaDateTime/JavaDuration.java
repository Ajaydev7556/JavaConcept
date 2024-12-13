package JavaDateTime;

import java.time.Duration;
import java.time.Instant;

public class JavaDuration {
	
	public static void main(String[] args) throws Exception {
		
		System.out.println("Subsciption start");
		
		Instant subscriptionStartTime = Instant.now();
		
		Thread.sleep(5000);  //End after 5 Seconds
		
		Instant subscriptionEndTime = Instant.now();
		
		Duration d1 = Duration.between(subscriptionStartTime, subscriptionEndTime);
		
		System.out.println(d1);
		
		long  d2 = d1.toSeconds();
		
		if(d2==5)
		{
		System.out.println("Subsription End ... Please Renew!");
		}
		
	}

}
