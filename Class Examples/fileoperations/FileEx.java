package com.fileoperations;

import java.io.File;
import java.io.IOException;

public class FileEx {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\PRADEEP GOUD\\Desktop\\November.txt");
	
		System.out.println(file.isFile());
		
		file.createNewFile();
		
		System.out.println(file.isFile());
		
		System.out.println("The file is successfully");
	
	
	
	
	}

}
