
public class ThrowDemo {
	
	public static void hello(int a)
	{
		if(a==0)
		throw new ArithmeticException("testing");
		else
			System.out.println(a);
	}

	public static void main(String[] args) {
		
		hello(0);
		
		

	}

}
