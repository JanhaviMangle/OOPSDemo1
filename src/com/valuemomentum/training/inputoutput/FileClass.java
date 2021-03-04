package com.valuemomentum.training.inputoutput;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileClass {

	public static void main(String[] args) {
	
		File f=new File("c:/test/hello.txt");
		
		try {
			
			if(f.createNewFile())
			{
				System.out.println("new file created!");
			}
				else
				{
					System.out.println("the new file alreay exist");
				}
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		
		System.out.println("name of the file"+ f.getName());
		System.out.println("name of the file"+ f.getPath());
		System.out.println("name of the file"+ new Date( f.lastModified()));
		System.out.println("name of the file"+ f.getParent());
		System.out.println("name of the file"+ f.length()+" bytes");
		

	}
}
