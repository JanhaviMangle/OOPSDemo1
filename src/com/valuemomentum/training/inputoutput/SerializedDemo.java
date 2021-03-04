package com.valuemomentum.training.inputoutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializedDemo {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.name="janhavi";
		e.address="castle stree,banglore";
		e.SSN=12121313;
		e.number=101;
		
		try
		{
			FileOutputStream fileOut=new FileOutputStream("c:/data/employee.ser");
		ObjectOutputStream Out=new ObjectOutputStream(fileOut);
		Out.writeObject(e);
		Out.close();
		fileOut.close();
		System.out.println("serialized data is saved in c:/data/employee.ser");
		
		
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}

	}

}
