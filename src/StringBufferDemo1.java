
public class StringBufferDemo1 {

	public static void main(String[] args) {
		
	StringBuffer str=new StringBuffer("JamesGosling");
	int l=str.length();
	System.out.println("the length of string is:"+ l); //12
	System.out.println("the capacity of string is:"+str.capacity()); //28-12+16
    System.out.println("the reversed string:"+str.reverse());
	System.out.println("the substring;"+str.substring(0, 4)); //returns string  from 
       //starting index to length -1
	str.replace(5, 10, "java");
	System.out.println(str);
	
	str.delete(2, 5);
	System.out.println(str);
	
	
	
	}

}
