package com.fileoperations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWirterEx {

	public static void main(String[] args) throws IOException {

		FileWriter filewirter = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");

		PrintWriter fw = new PrintWriter(filewirter);

		fw.println(1234);

		fw.println("good morning");

		char ch[] = { 'a', 'b', 'c' };

		fw.println(ch);

		System.out.println("written into the file succesfully");

		fw.flush();

		fw.close();

	}

}
