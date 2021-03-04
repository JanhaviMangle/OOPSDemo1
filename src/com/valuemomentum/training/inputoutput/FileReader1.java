package com.valuemomentum.training.inputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileReader1 {

	public static void main(String[] args) {
		
		try {
			Reader reader=new FileReader("c:/data/file.txt");
			int data=reader.read();
			while(data!=-1)
			{
				System.out.println((char)data);
				data=reader.read();
			}
			reader.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
