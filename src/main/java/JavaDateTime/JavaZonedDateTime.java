package JavaDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class JavaZonedDateTime {
	
	public static void main(String[] args) {
		
		ZonedDateTime now = ZonedDateTime.now();
		
		System.out.println("Local DateTime with Zone : "+now);
		
		System.out.println("\n\nGet All Zone ID : ");
		
		ZonedDateTime customZonedDateTime = ZonedDateTime.of(2015, 05, 16, 14, 15, 0, 0, ZoneId.of("Israel"));
		
		System.out.println("\n\nCustom ZonedDateTime : "+customZonedDateTime);
		
		ZonedDateTime parse = ZonedDateTime.parse("2015-05-16T14:15+03:00[Europe/London]");
		
		System.out.println("\n\nParse ZonedDateTime : "+parse);
		System.out.println();
		
		Set<String> zoneId = ZoneId.getAvailableZoneIds();
		
		for(String zone : zoneId)
		{
			System.out.println(zone);
		}
	}
	


}
