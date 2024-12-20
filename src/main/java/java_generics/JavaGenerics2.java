package java_generics;

public class JavaGenerics2 <K, V> {
	
	
	private K key;
	private V value;
	
	public JavaGenerics2(K key, V value)
	{
		this.key = key;
		this.value = value;
	}
	
	public K getKey()
	{
		return key;
	}
	
	public V getValue()
	{
		return value;
	}
	

}
