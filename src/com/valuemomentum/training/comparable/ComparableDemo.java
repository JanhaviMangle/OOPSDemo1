
package com.valuemomentum.training.comparable;
import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(111,"john",299));
		al.add(new Student(222,"john",299));
		al.add(new Student(333,"john",299));
		
		Collections.sort(al);
		for(Student st:al)
		{
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
