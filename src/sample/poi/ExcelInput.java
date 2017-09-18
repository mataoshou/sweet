package sample.poi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelInput
{
	public void input() throws IOException
	{
		Workbook wb = new HSSFWorkbook(); // or new XSSFWorkbook();
		Sheet sheet1 = wb.createSheet("new sheet");
		Sheet sheet2 = wb.createSheet("second sheet");
		Sheet sheet3 = wb.createSheet("three sheet");
		
		 // Create a row and put some cells in it. Rows are 0 based.
	    Row row = sheet1.createRow((short)0);
	    // Create a cell and put a value in it.
	    Cell cell = row.createCell(0);
	    cell.setCellValue(1);

	    // Or do it on one line.
	    row.createCell(1).setCellValue(1.2);
	    row.createCell(2).setCellValue("This is a string");
	    row.createCell(3).setCellValue(true);
	    
		FileOutputStream fileOut = new FileOutputStream("20170907workbook.xls");
	    wb.write(fileOut);
	    fileOut.close();
	    System.out.println("......测试成功.........");
	}
	
	public static void main(String [] args)
	{
		ExcelInput input =new ExcelInput();
		try
		{
			input.input();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
