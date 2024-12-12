package ListCollection;

import java.util.LinkedList;

public class LinkedListCollection {
	
	public static void main(String[] args) {
		
	LinkedList<String> linkedlist = new LinkedList<>();
	
	linkedlist.add("TEST1");
	linkedlist.add("TEST2");
	linkedlist.add("TEST3");
	linkedlist.add("TEST4");
	linkedlist.add("TEST5");
	
	System.out.println("Before any operation\n"+linkedlist);
	
	System.out.println("\n\nGet value from LinkedList with index using get()\nValue [2] = "+linkedlist.get(2));
	
	
	linkedlist.addFirst("TEST6");
	System.out.println("\n\nAfter using addFirst() \n"+linkedlist);
	
	linkedlist.addLast("TEST7");
	System.out.println("\n\nAfter using addLast() \n"+linkedlist);
		
	}
	

}
