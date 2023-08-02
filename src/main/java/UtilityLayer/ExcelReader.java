package UtilityLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.BaseClass;

public class ExcelReader extends BaseClass{

	XSSFWorkbook workbook;
	public ExcelReader (String filepath) throws IOException {
		File f = new File(filepath);
		FileInputStream fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
		
		
	}
	public int getTotalRowCount(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getLastRowNum();
	}
	
	public int getTotalCellCount(int sheetindex) {
		return workbook.getSheetAt(sheetindex).getRow(0).getLastCellNum();
	}
	
	public Object getSpecifictSheetDate(int sheetindex,int row, int cells) {
		XSSFCell cell = workbook.getSheetAt(sheetindex).getRow(row).getCell(cells);
		if(cell== null) {
			return "";
		}
		if(cell!=null) {
			if(cell.getCellType()==XSSFCell.CELL_TYPE_STRING) {
				return cell.getStringCellValue();
			}
			
			if(cell.getCellType()==XSSFCell.CELL_TYPE_BOOLEAN) {
				return cell.getBooleanCellValue();
			}
			if(cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC) {
				return cell.getNumericCellValue();
			}
			if(cell.getCellType()==XSSFCell.CELL_TYPE_FORMULA) {
				cell.getCellFormula();
			}
		}
		return cell;
		
	}
	
	public Object [][] getAllData(int sheetindex){
		int rows = getTotalRowCount(sheetindex);
		int columns=getTotalCellCount(sheetindex);
		
		Object[][]data=new Object[rows][columns];
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				data[i][j]=getSpecifictSheetDate(sheetindex,i,j);
			}
		}
		return data;
		
	}
}
