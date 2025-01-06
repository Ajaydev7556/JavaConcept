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
        	throw new Exception(email+" : Invalid email!");
        }
        else
        {
        	System.out.println(email+" : Email Address Accepted");
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
	
	@Override
	public String toString()
	{
		return email;
	}

	@Override
	public void getUserInfo() throws Exception {
		try {
			validatEmail(email);
			}
			catch (Exception e) {
				e.printStackTrace();
			}		
	}
}


class CustomMethodAccess<T extends ValidateEmail & CustomMethod>
{
	private T email;
	
	public void setUserinfo2(T email)
	{
		this.email = email;
	}
	
	public String getEmail()
	{
		
		return email.toString();
	}
	
	
	GetUserInfo setData = new GetUserInfo();
	
	public void assignUserData()
	{
		setData.setUserinfo1(getEmail());
	}
	
}
