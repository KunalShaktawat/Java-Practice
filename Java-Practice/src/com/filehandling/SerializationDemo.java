package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {
	int id=1;
	String name="Kunal";
	transient String password="12@4";
	
	public static void main(String[] args) throws Exception {
		SerializationDemo s=new SerializationDemo();
		FileOutputStream fo=new FileOutputStream("serialdemo.txt");
		ObjectOutputStream os=new ObjectOutputStream(fo);
		os.writeObject(s);
		os.close();
		System.out.println("Serialization completed");
		FileInputStream fi=new FileInputStream("serialdemo.txt");
		ObjectInputStream oi=new ObjectInputStream(fi);
		Object obj1=oi.readObject();
		SerializationDemo s2=(SerializationDemo) obj1;
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.password);
		oi.close();
	}

}
