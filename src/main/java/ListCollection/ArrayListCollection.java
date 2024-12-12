package ListCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCollection {
	
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		
		System.out.println("Before operations");
		
		for (int num : list)
		{
			System.out.println(num);
		}
		System.out.println("Size : "+list.size());
		
		// Remove
		list.remove(2);		
		
		System.out.println("\nAfter remove() operation");
		for (int num : list)
		{
			System.out.println(num);
		}
		System.out.println("Size : "+list.size());
		
		// Set Value with index
		list.set(2, 60)	;
		
		System.out.println("\nAfter set() operation");
		for (int num : list)
		{
			System.out.println(num);	
		}
		System.out.println("Size : "+list.size());
		
		// Add Value with index
		list.add(2, 80)	;
		
		System.out.println("\nAfter add() operation");
		for (int num : list)
		{ 
			System.out.println(num);
		}
		System.out.println("Size : "+list.size());
		
		
		
		List<Integer> list2 = List.of(15, 16, 17, 18, 19, 20);
		
		list.addAll(list2);
		
		
		System.out.println("\nAfter using list.of() and addAll() operation");
		for (int num : list)
		{ 
			System.out.println(num);
		}
		System.out.println("Size : "+list.size());
		
		
		List<String> arrays_as_list = Arrays.asList("TEST1", "TEST2", "TEST3");
		
		System.out.println("\nUse of Arrays.asList()");
		for (String data : arrays_as_list)
		{ 
			System.out.println(data);
		}
		System.out.println("Size : "+arrays_as_list.size());
		
		
		System.out.println("\nConvert Array to List using Arrays.asList()");
		
		String [] array = {"TEST1", "TEST3", "TEST2", "TEST5", "TEST4"};
		
		List<String> converted_array_list = Arrays.asList(array);
		for (String data : converted_array_list)
		{ 
			System.out.println(data);
		}
		System.out.println("Size : "+converted_array_list.size());
		
		
		System.out.println("\nConverting to Array using list.toArray()");
		
		
		Object [] converted_array_list2 = converted_array_list.toArray();
		
		int array_index =0;
		
		for (Object Object : converted_array_list2)
		{ 
			
			System.out.println("Array ["+array_index+"] = "+Object);
			array_index++;
		}
		
		System.out.println("\nSort ArrayList using sort()");
		System.out.println("Before Sorting "+converted_array_list);
		
		Collections.sort(converted_array_list);
		
		
		System.out.println("Afer Sorting "+converted_array_list);
	}

}
