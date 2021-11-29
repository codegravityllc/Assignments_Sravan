package com.my.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {
		// creating a file

		File file = new File("C:\\codeGravityTraining\\Files\\TestFiles.txt");
		boolean fileFlag;
		try {
			fileFlag = file.createNewFile();
			System.out.println("New file is created : " + fileFlag);
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			Thread.sleep(10000); // it stops to execute the delete functions.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// deleting a file

		boolean deleteFileFlag;
		deleteFileFlag = file.delete();
		System.out.println("File deleted :" + deleteFileFlag);

	}

}
