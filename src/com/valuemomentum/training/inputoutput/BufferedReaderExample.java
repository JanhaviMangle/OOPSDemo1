package com.valuemomentum.training.inputoutput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample{    
public static void main(String args[])throws Exception{             
    InputStreamReader r=new InputStreamReader(System.in);    
    BufferedReader br=new BufferedReader(r);            
    System.out.println("Enter your name &age");    
    String name=br.readLine();  
    String age=br.readLine(); 
    System.out.println("Welcome "+name+"age"+age);    
}    
}  