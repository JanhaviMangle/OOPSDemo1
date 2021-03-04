import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer,String> languages=new HashMap<>();
		languages.put(1, "java");
		languages.put(2, "python");
		languages.put(3, "javascript");
		System.out.println("HashMap:"+languages);
		
		String value=languages.get(1);
		System.out.println("value at index 1:"+value);
		System.out.println("value at index 1"+languages.get(3));
	
	System.out.println("keys"+languages.keySet());
	System.out.println("value at index 1"+languages.values());
	System.out.println("keys/valuee mapping:"+languages.entrySet());
	
	languages.replace(2, "C++");
	System.out.print("keys:");
	for(Integer key:languages.keySet())
	{
		System.out.print(key+" - "+languages.get(key));
		System.out.print(", ");
		// iterate through key/value entries
	    System.out.print("\nEntries: ");
	    for (Entry<Integer, String> entry : languages.entrySet()) {
	      System.out.print(entry);
	      System.out.print(", ");
	    }
	}
	}
}
