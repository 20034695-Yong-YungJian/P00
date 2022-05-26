import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20034695, May 26, 2022 12:10:41 PM
 */

/**
 * @author 20034695
 *
 */
public class CalcultorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	
	@Before
		public void setUp() throws Exception {
		}
	
	@Test
	public void testAddNormal() {
		int a = 3;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 7;
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testAddBoundary() {
		int a = 3;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 7;
		
		
	assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	}
	
	@Test
	public void testAddError() {
		int a = -3;
		int b = -4;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 7;
		
		assertEquals(actual, expected);
	
	}
	
	@Test
	public void testSubstractNormal() {
		int a = 5;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int expected = 1;
		
		assertEquals(actual, expected);
	}
	
	public void testSubstractBoundary() {
		int a = 5;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int expected = 1;
		
		assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	}
	
	@Test
	public void testSubstractError() {
		int a = 5;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a, b);
		
		int expected = 1;
		
		assertEquals(actual, expected);
	}
	
	
	@Test
	public void testMultiplyNormal() {
		int a = 7;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 7;
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testMultiplyBoundary() {
		int a = 7;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 7;
		
		assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	}
	
	@Test
	public void testMultiplyError() {
		int a = 0;
		int b = 1;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 7;
		
		assertEquals(actual, expected);
	}
	
	@Test
	public void testDivideNormal() {
		int a = 4;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 1;
		
		assertEquals(actual, expected);
		
	}@Test
	public void testDivideBoundary() {
		int a = 4;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 1;
		
		assertTrue((a >= 0 && a <= 9999) && (b >= 0 && b <= 9999));
	}
	
	public void testDivideError() {
		int a = -4;
		int b = 4;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 1;
		
		assertEquals(actual, expected);
	}
	
	@After
	public void tearDown() throws Exception {
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	

	

	

}
