package com.xworkz.hibernetPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PalaceReadTester {
	public static void main(String[] args) {

		try {
			File file = new File("C:\\ExcelSheet\\Palace.xlsx");
			FileInputStream fis = new FileInputStream(file);

			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> itr = sheet.iterator();
			while (itr.hasNext()) {
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					System.out.println(cell.toString());

				}
				System.out.println("");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
