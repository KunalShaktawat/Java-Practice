package com.exceptionalhandling;

import java.io.File;
import java.io.IOException;

public class Practice02 {
	public static void main(String[] args)throws IOException{
		// Display all files in a give location
		File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\Java-2025");
		String s[]=f.list();
		for(String a:s) {
			File ff=new File(f,a);
			if(ff.isDirectory()) {
				System.out.println("true");
				System.out.println(a);
			}
			
		}
		
	}
	
}
