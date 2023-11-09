package com.fileoperations;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");

		fw.write(1234);

		fw.write("good morning");

		char ch[] = { 'a', 'b', 'c' };

		fw.write(ch);

		System.out.println("written into the file succesfully");

		fw.flush();

		fw.close();
		
		
		
		//numbers are not accepting
		
		//no new line

	}

}
