//package com.app;
import java.io.*;

public class Example1 {
	public static void readDataFromFile(String path){
		File textFile = new File(path);
		try{
			FileReader fr = new FileReader(textFile);
			/*int letter = fr.read();
			while(letter != -1){
				System.out.println((char)letter);
				letter = fr.read();
			}*/
			BufferedReader br = new BufferedReader(fr);
			String s = br.readLine();
			while(s != null){
				System.out.println(s);
				s = br.readLine();			
			}
			br.close();
			fr.close();
		}catch (FileNotFoundException e){}
		catch(IOException e){}
	}
	
	public static void writeToFile(String fileName){
		FileWriter textFile;
		try {
			textFile = new FileWriter(fileName);
			textFile.write("This is my first line.\n");
			textFile.write("This is my second line.\n");
			textFile.write("This is my third line.\n");
			textFile.flush();
			textFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void appendToFile(String fileName){
		FileWriter textFile;
		try {
			textFile = new FileWriter(fileName, true);
			textFile.write("This is my new first line.\n");
			textFile.write("This is my  new second line.\n");
			textFile.write("This is my new third line.\n");
			textFile.flush();
			textFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\jessi\\workspace\\IOExample\\src\\resources\\data.txt";
		readDataFromFile(path);
		String outputFile = "C:\\Users\\jessi\\workspace\\IOExample\\src\\resources\\OutputFile.txt";
		writeToFile(outputFile);
		appendToFile(outputFile);
	}

}
