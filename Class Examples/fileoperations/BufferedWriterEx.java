package com.fileoperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterEx {

	public static void main(String[] args) throws IOException {
		
		FileWriter filewirter = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");
		
		BufferedWriter fw= new BufferedWriter(filewirter);
		
		fw.write(1234);
		
		fw.newLine();

		fw.write("good morning");
		
		fw.newLine();

		char ch[] = { 'a', 'b', 'c' };

		fw.write(ch);

		System.out.println("written into the file succesfully");

		fw.flush();

		fw.close();
		
		//not accept number
		
		
	}

}
