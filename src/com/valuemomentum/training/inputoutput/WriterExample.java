package com.valuemomentum.training.inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) {
		try {
			Writer w=new FileWriter("c:/demo/dada.yxt");
			String content="she sells sea shells in the sea";
			w.close();
			System.out.println("data written");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
