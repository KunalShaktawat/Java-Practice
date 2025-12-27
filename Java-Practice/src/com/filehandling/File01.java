package com.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("Data.txt");
		fw.write("Hello Java\n");
		fw.write("Hello Js\n");
		fw.write("Hello Python\n");
		fw.write("Hello Springboot\n");
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader("Data.txt");
		
		BufferedReader bf=new BufferedReader(fr);
		String s;
		
		while((s=bf.readLine())!=null) {
			System.out.println(s);
		}
		
	}

}
