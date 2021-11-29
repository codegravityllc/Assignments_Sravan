package com.my.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFileUsingStream {

	public static void main(String[] args) {
		// creating file using stream, which is only used for bytes value
		File file = new File("C:\\codeGravityTraining\\Files\\samplefile.txt");
		String str = "This is IO training and creating new file using stream.";
		FileOutputStream fos = null;
		System.out.println("creating new file.");
		try {
			fos = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("The file mentioned is invalid." +e);
		}
		try {
			if(file.createNewFile()) {
				System.out.println("New file is created.");
			}
		} catch (IOException e) {
			System.out.println("Excepting while creating new file." +e);
		}
		
		byte[] bytes = str.getBytes();
	try {
		fos.write(bytes); //need to change string to byte code in otputstream
	} catch (IOException e) {
		System.out.println("Excepting while writing data to file." +e);
	}
	finally {
		try {
			fos.close();
		} catch (IOException e) {
			System.out.println("Excepting while closing the stream." +e);
		}
	}
		

	}

}
