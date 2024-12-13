package JavaDateTime;

import java.time.LocalDateTime;

public class JavaLocalDateTime {
	
	public static void main(String[] args) {
		
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println("Local Date and Time : "+now);
		
		LocalDateTime myDateTime = LocalDateTime.of(2012, 05, 13, 17, 30);
		
		System.out.println("\n\nCustom DateTime : "+myDateTime);
		
		LocalDateTime parse = LocalDateTime.parse("2012-05-13T17:30:27");
		
		System.out.println("\n\nParse Date and Time : "+parse);
		
		
	}

}
