package demo.sample;
import org.junit.Test; 
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
	private Calculator objCalcUnderTest;
	private final Calculator calc = mock(Calculator.class);
	@Before
	public void setUp() {
	objCalcUnderTest = new Calculator();
	}
	
	@Test
	public void testAdd() { 
	int a = 15; int b = 20; 
	int expectedResult = 35;
	long result = objCalcUnderTest.add(a, b);
	assertEquals(expectedResult, result);
	}
	
	@Test
	public void testSubtract() {
	int a = 25; int b = 20; 
	int expectedResult = 5; 
	long result = objCalcUnderTest.subtract(a, b);
	assertEquals(expectedResult, result);
	}
	
	@Test
	public void testMultiply() {
	int a = 10; int b = 25;
	long expectedResult = 250;
	long result = objCalcUnderTest.multiply(a, b);
	assertEquals(expectedResult, result);
	}
	
	@Test
	public void testDivide() {
	int a = 56; int b = 10; 
	double expectedResult = 5.6; 
	double result = objCalcUnderTest.divide(a, b);
	assertEquals(expectedResult, result,0.00005); 
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() { 
	int a = 15; int b = 0;
	objCalcUnderTest.divide(a, b);
	} 
	
	@Test
	public void testMock() {
		when(calc.multiply(2,3)).thenReturn((long) 6);
		assertEquals(6, calc.multiply(2, 3));
	}
}
