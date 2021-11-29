package com.my.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ReadingFileUsingReader {

	public static void main(String[] args) throws IOException { //either you can through exception or try/catch
		FileReader fileReader = new FileReader("C:\\codeGravityTraining\\Files\\sampleWriterfile.txt");
		BufferedReader bufferReader = new BufferedReader(fileReader);
		//String str = null;
				
		String str= bufferReader.readLine();
		System.out.println(str);
		
		bufferReader.close();

	}

}
