
package java_generics;

public class JavaBoundedParaGenericTest {
	
	public static void main(String[] args) {
		
		JavaBoundedParaGeneric<Long> boundedTest = new JavaBoundedParaGeneric<>();
		
		boundedTest.setNumber(1234567890l);
		
		System.out.println("Phone Number : "+boundedTest.getPhoneNumber());
		
		
		
		// Java Bounded Type Parameter Generic with extends class and interface
		
//		CustomMethodAccess<String> accessCustom = new CustomMethodAccess<>();
//		
//		accessCustom.setUserinfo("Ajay", "Kumar");
//		
//		String [] data = accessCustom.getUserInfo1();
//		
//		for( String user_data : data)
//		{
//			System.out.println(user_data);
//		}
		
		
	}

}
