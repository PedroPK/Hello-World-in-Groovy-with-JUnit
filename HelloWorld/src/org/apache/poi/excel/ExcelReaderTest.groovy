package org.apache.poi.excel

import static org.junit.Assert.assertNotNull
import static org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class ExcelReaderTest {
	
	private static final String PATH =  "";
	
	private ExcelReader er;
	
	@BeforeEach
	void setUp() {
		er = new ExcelReader();
	}
	
	@Test
	void testGetSheet() {
		assertNotNull( er.getSheet(PATH) );
	}
	
	@Test
	void testGetFirstRow() {
		assertNotNull( er.getFirstRow( er.getSheet(PATH) ) )
	}
	
	@Test
	void testGetFirstCell() {
		assertNotNull( er.getFirstCell( er.getSheet(PATH) ) );
	}
	
	@Test
	void testGetFirstCellStringValueNotNull() {
		assertNotNull( er.getFirstCell( er.getSheet(PATH) ) );
	}
	
	@Test
	void testGetFirstCellStringValueEqualsNome() {
		assertEquals("Nome",  er.getFirstCellContent( er.getFirstCell( er.getSheet(PATH) ) ) );
	}
	
	@Test
	void testReadColumnsOfARow() {
		fail("Not yet implemented")
	}

	@Test
	void testIterateRows() {
		fail("Not yet implemented")
	}

}
