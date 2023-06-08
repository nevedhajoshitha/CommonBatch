package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteInExcel{
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\NEVEDHA\\eclipse2-workspace\\Commontest\\src\\test\\resources\\WriteData.xlsx");
		
		XSSFWorkbook w = new XSSFWorkbook();
		
		XSSFSheet s = w.createSheet("NewSheet");
		
		XSSFRow r = s.createRow(1);
		
		r.createCell(1).setCellValue("Welcome");
		
		FileOutputStream os = new FileOutputStream(f);
		
		w.write(os);
	}
}