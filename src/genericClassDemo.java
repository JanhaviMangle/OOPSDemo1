class Sample<T>   //GENERIC CLASS
{
	private T data;
	

	public Sample(T data) {
		super();
		this.data=data;

	}

	public T getData() {
		return data;
	}

	public void setData(T data ) {
		this.data=data;
	}
	
}
public class genericClassDemo {

	public static void main(String[] args) {
		
		Sample<Integer> s1=new Sample<Integer>(); //creating object of generic class
		s1.setData(15);
		System.out.println("display fron generic class of type integer:"+s1.getData());
		
		Sample<String> s2=new Sample<String>(); //creating object of generic class
		s2.setData("java generics");
		System.out.println("display fron generic class of type string:"+s2.getData());
		
		Sample<Float> s3=new Sample<Float>(); //creating object of generic class
		s3.setData(120.35f);
		System.out.println("display fron generic class of type float:"+s3.getData());
		


		

	}

}
