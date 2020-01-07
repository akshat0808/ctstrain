package comm.example;
public class MyClass {
	public long add(int... a) {
		int result=0;
		for(int i:a)
		{
			result+=i;
		}
		return result;
	}
	public String add(String str,int a,int b) {
		return str+(a+b);
	}

}