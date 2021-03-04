package com.valuemomentum.training.inputoutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class DeserailizationDemo {

 public static void main(String[] args) throws Exception {
Employee e=null;
try {
FileInputStream fileIn=new FileInputStream("c:/data/employee.ser") ;
ObjectInputStream in =new ObjectInputStream(fileIn);
e=(Employee) in.readObject();
in.close();
}
catch(ClassNotFoundException c)
{
System.out.println("Employee class not found");
c.printStackTrace();
return;
}
System.out.println("Deserialized Employee");
System.out.println("Name" + " " +e.name);
System.out.println("Address" + e.address);
System.out.println("SSN" + " " + e.SSN);
System.out.println("Number" + " " + e.number);
}

}