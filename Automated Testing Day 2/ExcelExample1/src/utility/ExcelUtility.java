package utility;
import java.io.*;

import jxl.write.*;
import jxl.write.biff.RowsExceededException;

import java.util.ArrayList;
import java.util.List;

import jxl.*;
import jxl.read.biff.BiffException;

public class ExcelUtility {
	private static File excelFile = new File("C:\\Users\\jessi\\Dropbox\\Syntel\\Data.xls");
	private static Workbook excelWorkbook = null;
	private static WritableWorkbook wWorkbook = null;
	private static Sheet rsheet = null;
	private static Object data[][] = null;
	private static WritableSheet wsheet = null;

	static{
		try {
			excelWorkbook = Workbook.getWorkbook(excelFile);
			wWorkbook = Workbook.createWorkbook(excelFile, excelWorkbook);
			rsheet = excelWorkbook.getSheet("TestData");
			wsheet = wWorkbook.getSheet("TestData");
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static Object[][] readDataFromExcel(){
		int colCount = rsheet.getColumns();
		int rowCount = rsheet.getRows();
		data = new Object[rowCount-1][colCount];
		for(int r = 1; r < rowCount; r++){
			for(int c = 0; c < colCount; c++){
				data[r-1][c] = Integer.parseInt(rsheet.getCell(c, r).getContents());
				System.out.println(rsheet.getCell(c, r).getContents());
			}
		}
		return data;		
	}
	
	public static void writeData(ArrayList<String> result){
	    Label l = new Label(3, 0, "Results");
	    try {
			wsheet.addCell(l);
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    for(int i = 0; i < result.size(); i++){
		    Label l2 = new Label(3, (i+1), result.get(i));
		    
		    try {
				wsheet.addCell(l2);
			} catch (WriteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    try {
			wWorkbook.write();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			wWorkbook.close();
		} catch (WriteException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}
