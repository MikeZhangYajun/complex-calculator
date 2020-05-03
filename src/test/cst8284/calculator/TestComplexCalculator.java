package test.cst8284.calculator;
import cst8284.calculator.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComplexCalculator {

	@Test
	public void testToString() {
		Complex c = new Complex(3, 2);
		assertTrue(c.toString().equals("3.0 + 2.0i"));
	}
	

	
	
	//1. Use assertNotNull() to test the ComplexCalculator() i.e. no-arg constructor (1 mark)
	
	@Test
	public void testComplexCalculator() {
		assertNotNull(new ComplexCalculator());
	}


	

	//5. Using assertTrue(boolean), test that two Complex numbers created using the Complex(String, String) constructor 
	//	and the Complex(int, int) constructor give the correct result using the divide() method.  
	//	Use equals(Complex) to compare the actual and expected result (1 mark)
	
	@Test
	public void testDivide() {
		assertTrue(new ComplexCalculator().divide(new Complex("7", "12i"), new Complex(4, -4)).equals(new Complex(-0.625, 2.375)));
	}
	
	
	
	
	
	
	//6. Divide two Complex numbers and use the result to test your 
	//	equals(double expected, double actual, double delta) method, with delta = .0000001 (3 marks)
	
	@Test
	public void testEqualsDouble() {
		assertTrue(new ComplexCalculator().divide(new Complex("7", "12i"), new Complex(4, -4)).equals(-0.625, 2.375, 0.0000001));
	}
	
	
	
//	@Test
//	public void testGetImag() {
//		for (int a = 0; a < 10; a++) {
//			for (int b = 0; b < 10; b++) {
//				Complex c1 = new Complex(a, b);
//				Complex c2 = new ComplexCalculator().multiply(c1, c1.conjugate());
//
//				assertEquals(c2.getImag(), 0.0, 1e-12);
//			}
//		}
//	}
	
	
	

}
