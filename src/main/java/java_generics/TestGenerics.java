package java_generics;

public class TestGenerics {
	
	public static void main(String[] args) throws Exception{
		
		// Get String Data
		JavaGenerics<String> stringGen = new JavaGenerics<>();
		stringGen.setData("Ajay");
		System.out.println("Get String Value : "+stringGen.getData());
		
		// Get Integer Data
		JavaGenerics<Integer> integerGen = new JavaGenerics<>();
		integerGen.setData(5454);
		System.out.println("Get Integer Value : "+integerGen.getData());
		
		// Get float Data
		JavaGenerics<Double> floatValueGen = new JavaGenerics<>();
		floatValueGen.setData(4545.54);
		System.out.println("Get Double Value : "+floatValueGen.getData());
		
		
		
		// Get Key Value Pair
		JavaGenerics2<String, Long> genTest2 = new JavaGenerics2<>("Mobile", 911234567890l);
		
		System.out.println("\n\n"+genTest2.getKey()+" : "+genTest2.getValue());
		
		
		// Access Generic interface
		StringContainer<String> containerValue = new StringContainer<>();
		containerValue.addEmail("test@yopmail.com");
		System.out.println("\n\nEmail : "+containerValue.getEmail());
		
 
		CustomMethodAccess<GetUserInfo> customMethodAccess = new CustomMethodAccess<>();
		
		String email = "Test@yopmail.com";
		
		GetUserInfo userInfo = new GetUserInfo();
		userInfo.setUserinfo1(email);
		
		customMethodAccess.setUserinfo2(userInfo);
		customMethodAccess.assignUserData();
		

	}

}
