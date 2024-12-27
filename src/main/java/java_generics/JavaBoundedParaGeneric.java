package java_generics;

// bounded Type Parameter with extend class

class JavaBoundedParaGeneric<N extends Number> {
	
	private N phoneNumber;
	
	public void setNumber(N phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	public N getPhoneNumber()
	{
		return phoneNumber;
	}

}

interface CustomMethod
{
	void getUserInfo() throws Exception;
}

class ValidateEmail
{
	public void validatEmail(String email) throws Exception
	{
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        
        if(!(email.matches(emailRegex)))
        {
        	throw new Exception("Invalid email!");
        }
        else
        {
        	System.out.println("Email Address Accepted");
        }
        
	}
}

class GetUserInfo extends ValidateEmail implements CustomMethod
{
	private String email;
	
	public void setUserinfo1(String email)
	{;
		this.email = email;
	}
	
	public void getUserInfo() throws Exception{
				
		System.out.println("Test Email : "+email);
		validatEmail(email);
		
	}
	
}


class CustomMethodAccess<T extends ValidateEmail & CustomMethod>
{
	private T email;
	
	public void setUserinfo2(T email)
	{
		this.email = email;
	}
	
	public Object getEmail()
	{
		
		String emailAsString = email.toString();
		System.out.println(emailAsString);
		return emailAsString.toString();
	}
	
	GetUserInfo setData = new GetUserInfo();
	
	public void assignUserData()
	{
		System.out.println("Method call");
//		setData.setUserinfo1(getEmail());
		System.out.println(getEmail());
		System.out.println("Method call end");
	}
	
}
