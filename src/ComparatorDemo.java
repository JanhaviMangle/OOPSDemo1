import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student5> ar=new ArrayList<Student5>();
		
		Student5 s1=new Student5(111,"john","bengluru");
		Student5 s2=new Student5(222,"john","bengluru");
		Student5 s3=new Student5(333,"john","bengluru");
		Student5 s4=new Student5(444,"john","bengluru");
		
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		System.out.println("**********Sorted Array List by Roll No:**********");
		for (int i=0; i<ar.size(); i++)
    System.out.println(ar.get(i));
		
		Collections.sort(ar, new SortRoll());
		System.out.println("**********Sorted Array List by Name:**************");
		for (int i=0; i<ar.size(); i++)
		System.out.println(ar.get(i));
				

        Collections.sort(ar, new SortByName());
        System.out.println("**********Sorted Array List by Name:**************");
        for (int i=0; i<ar.size(); i++)
        System.out.println(ar.get(i));
		
		
	}

}
