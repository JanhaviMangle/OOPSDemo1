package com.valuemomentum.training.inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo{ 
public static void main(String args[]) { 

// Writing to a file using BufferedWriter in Java 

try { 
FileWriter writer = new FileWriter("c:/data/names.txt",true); 
BufferedWriter bwr = new BufferedWriter(writer);  

bwr.write("James"); 
bwr.write("\n"); // bwr.newLine();
bwr.write("Hobert"); 
bwr.close(); 

System.out.println("succesfully written to a file"); } 
catch (IOException ioe) { 
ioe.printStackTrace(); 

}
 } 
}

