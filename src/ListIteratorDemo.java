import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("jim");
		al.add("jerry");
		al.add("john");
		al.add("jive");
		
		System.out.println("element at 2nd position"+al.get(2));
		
		ListIterator<String>itr=al.listIterator();
		
		System.out.println("travelling elements in forward direction"+al.get(2));
         while(itr.hasNext())
         {
        	 System.out.println(itr.next()); 
         }
         System.out.println("travelling elements in backward direction"); 
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	}

}
