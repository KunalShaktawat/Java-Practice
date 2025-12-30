package com.exceptionalhandling;

import java.io.File;

public class Practice01 {
	// Create file in a given folder
	
	public static void main(String[] args) {
		File fd=new File("data");
		fd.mkdir();
		File f=new File(fd,"file.txt");
		try {
			f.createNewFile();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
