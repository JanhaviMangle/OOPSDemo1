
import java.awt.print.Book;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		//creating map of objects
		Map<Integer, String> mapBook1=new Map<Integer,String>();
		
		//creating books
		Book1 b1=new Book1(101,"let us c","yashwat kanetkar","BPB",8);
		Book1 b2=new Book1(102,"DCN","Forouzan","BPB",5);
		Book1 b3=new Book1(103,"OS","Galvin","BPB",6);
		//traverse map
		mapBook1.put(1, b1);
		mapBook1.put(3, b2);
		mapBook1.put(1, b3);
		
		for(Map.Entry<Integer, Book> e:mapBook.entrySet())
		{
			int key=e.getKey();
			Book b=e.getValue();
			
			System.out.println("book"+key+"details");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
        
	}

}
