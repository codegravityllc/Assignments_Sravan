package com.my.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreatingFileUsingwriters {
//using writers is easy than using outputstream as we don't need to change string to byte code.
	public static void main(String[] args) throws IOException { //either you can through exception or try/catch
		FileWriter fileWriter = new FileWriter("C:\\codeGravityTraining\\Files\\sampleWriterfile.txt");
		BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
		PrintWriter printWriter = new PrintWriter(bufferWriter);
		String str = "This is sample data using filewriter";
		printWriter.println();
		printWriter.println("This is first line");
		printWriter.println("This is second line");
		printWriter.println("This is third line");
		
		bufferWriter.write(str);
		//fileWriter.write(str);
		printWriter.close();
		bufferWriter.close();
		fileWriter.close();

	}

}
