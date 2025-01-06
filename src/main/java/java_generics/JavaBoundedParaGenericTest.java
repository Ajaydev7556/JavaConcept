
package java_generics;

public class JavaBoundedParaGenericTest {
	
	public static void main(String[] args) throws Exception {
		
		JavaBoundedParaGeneric<Long> boundedTest = new JavaBoundedParaGeneric<>();
		
		boundedTest.setNumber(1234567890l);
		
		System.out.println("Phone Number : "+boundedTest.getPhoneNumber());
		
		
		
		// Java Bounded Type Parameter Generic with extends class and interface

		CustomMethodAccess<GetUserInfo> customMethodAccess = new CustomMethodAccess<>();
		
		String email = "Test@yopmail.com";
		
		GetUserInfo userInfo = new GetUserInfo();
		userInfo.setUserinfo1(email);
		
		customMethodAccess.setUserinfo2(userInfo);
		customMethodAccess.assignUserData();
		userInfo.getUserInfo();
	}

}
