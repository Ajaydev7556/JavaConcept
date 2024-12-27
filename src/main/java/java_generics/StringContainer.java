package java_generics;

public class StringContainer<T> implements ContainerGenericsInterface<T>{
	
	private T email;

	@Override
	public void addEmail(T email) {
		this.email = email;
	}

	@Override
	public T getEmail() {
		return email;
	}

}
