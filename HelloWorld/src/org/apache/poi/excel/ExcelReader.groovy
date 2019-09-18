package org.apache.poi.excel

import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.DataFormatter
import org.apache.poi.ss.usermodel.Row
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator
import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

class ExcelReader {
	
	DataFormatter			aDtFormatter	= new DataFormatter();
	
	public XSSFSheet getSheet(String pFilePath ) {
		File					file		= new File(pFilePath);
		FileInputStream			fis			= new FileInputStream(file);
		
		XSSFWorkbook			srcBook		= new XSSFWorkbook(fis);
		XSSFFormulaEvaluator	evaluator	= new XSSFFormulaEvaluator(srcBook);
		
		XSSFSheet				aSheet		= srcBook.getSheetAt(0);
		
		return aSheet;
	}
	
	public getFirstRow( XSSFSheet pSheet ) {
		Iterator<Row>	iteratorRows	= pSheet?.iterator();
		if ( iteratorRows?.hasNext() ) {
			return iteratorRows.next();
		}
	}
	
	public getFirstCell( XSSFSheet pSheet ) {
		Iterator<Row>	iteratorRows	= pSheet?.iterator();
		if ( iteratorRows?.hasNext() ) {
			Iterator<Cell> iteratorCell = iteratorRows.next().iterator();
			if ( iteratorCell?.hasNext() ) {
				return iteratorCell.next();
			}
		}
	}
	
	public getFirstCellContent( Cell pCell ) {
		return pCell.getStringCellValue();
	}
	
	public readColumnsOfARow() {
	}
	
	public void iterateRows() {
		XSSFSheet		sheet			= getSheet();
		Iterator<Row>	iteratorRows	= sheet.iterator();
		
	}
	
	
	
}
