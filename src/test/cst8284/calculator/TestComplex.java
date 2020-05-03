package test.cst8284.calculator;
import cst8284.calculator.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComplex {

	
	
	//2. Use assertEquals(double, double, double) to test if getImag() 
	//	returns the correct value set using the Complex(int, int) constructor (1 mark)
	
	@Test
	public void testGetImage() {
		assertEquals(new Complex(3, 2).getImag(), 2.0 , 1e-12);
	}
	

	
	
	
	
	//3. Use assertEquals(double, double, double) to test if setReal() correctly resets the value set 
	//	using the Complex(double, double) constructor (1 mark)
	
	@Test
	public void testSetReal() {
		Complex c = new Complex(3.0, 2.0);
		c.setReal(5.0);
		assertEquals(c.getReal(), 5.0, 1e-12);
	}

	
	
	
	
	
	//4. Use the no-arg Complex() constructor, and then use the real and imaginary setters to set new integer values.  
	//	Then use assertTrue(boolean) to test the validity of your newly-added equals(int, int) method (1 mark)
	
	@Test
	public void testEquals() {
		Complex c = new Complex();
		c.setReal(3);
		c.setImag(2);
		assertTrue(c.equals(3, 2));
	}
	
	
	
	
	

}
