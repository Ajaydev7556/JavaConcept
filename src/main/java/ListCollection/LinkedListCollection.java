package ListCollection;

import java.util.Arrays;
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
	
	linkedlist.remove("TEST3");
	System.out.println("\n\nAfter using Remove method : \n"+linkedlist);
	
	
	LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10,20,30,40,50,60));
	
	LinkedList<Integer> numbersToRemove = new LinkedList<>(Arrays.asList(20,50));
	
	System.out.println("\n\nNumber List ==>\n"+numbers);
	
	numbers.removeAll(numbersToRemove);
	System.out.println("Number List after using RemoveAll()\t Number target: "+numbersToRemove+" ==>");
	System.out.println(numbers);
	
	
	
		
	}
	

}
