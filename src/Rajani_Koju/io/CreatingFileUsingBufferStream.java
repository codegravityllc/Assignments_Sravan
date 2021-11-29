package com.my.io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreatingFileUsingBufferStream {

	public static void main(String[] args) {
		// creating file using buffer stream is faster way of creating file, which is only used for bytes value
		File file = new File("C:\\codeGravityTraining\\Files\\samplebufferfile.txt");
		String str = "This is IO training and creating new file using buffer stream.";
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		System.out.println("creating new file.");
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
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
		bos.write(bytes);
		} catch (IOException e) {
		System.out.println("Excepting while writing data to file." +e);
	}
	finally {
		try {
			bos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("Excepting while closing the stream." +e);
		}
	}
		

	}

}
