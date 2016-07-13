import java.io.*;

public class IOExample {
	public static int countCharsInFile(String path){
		int count = 0;
		File textFile = new File(path);
		try{
			FileReader fr = new FileReader(textFile);
			int letter = fr.read();
			while(letter != -1){
				count++;
				letter = fr.read();
			}
			fr.close();
		}catch (FileNotFoundException e){}
		catch(IOException e){}
		return count;
	}
		
		public static int countLinesInFile(String path){
			int count = 0;
			File textFile = new File(path);
			try{
				FileReader fr = new FileReader(textFile);
				BufferedReader br = new BufferedReader(fr);
				String s = br.readLine();
				while(s != null){
					count++;
					s = br.readLine();			
				}
				br.close();
				fr.close();
			}catch (FileNotFoundException e){}
			catch(IOException e){}
			return count;
		}
		
		public static int countWordsInFile(String path){
			int count = 0;
			File textFile = new File(path);
			try{
				FileReader fr = new FileReader(textFile);
				BufferedReader br = new BufferedReader(fr);
				String s = br.readLine();
				while(s != null){
					String[] afterSplit = s.split(" ");
					count += afterSplit.length;
					s = br.readLine();			
				}
				br.close();
				fr.close();
			}catch (FileNotFoundException e){}
			catch(IOException e){}
			return count;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\jessi\\workspace\\IOProject\\src\\textfile.txt";
		int chars = countCharsInFile(path);
		int lines = countLinesInFile(path);
		int words = countWordsInFile(path);
		
		System.out.println("There are " + chars + " characters, " + words + " words, and " + lines + " lines in the file.");
	}
}
