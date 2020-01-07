package comm.example;

public class ArrStr {
	public static void main(String[] args)
	{
		String str="Hello Akshat";
		char[] ch= new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			
		}
		for (char c:ch) {
			System.out.println(c);
		}
	}

}
