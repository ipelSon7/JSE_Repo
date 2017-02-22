
import static org.junit.Assert.*;

import org.junit.Test;

public class StudentGradeTest {

	//Create new StudentGrade object
	StudentGrade stdGrad = new StudentGrade();
	//Create SimpleCalculator Object
	SimpleCalculator calculator = new SimpleCalculator();
	
	@Test
	public void testPrintGrade1() {		
		assertEquals("You have well done on this test", stdGrad.printGrade(85));
	}
	@Test
	public void testPrintGrade2(){
		assertNotEquals("You can be proud of yourself!", stdGrad.printGrade(60));
	}
	@Test
	public void testPrintGrade3(){
		assertNotEquals("You could do better", stdGrad.printGrade(49));
	}
	@Test
	public void testPrintGrade4(){
		assertEquals("You need to study more", stdGrad.printGrade(30));
	}
	
	@Test
	public void testAdd(){
		int sum = calculator.add(5, 5);
		assertTrue(10 == sum);
	}
	
	@Test
	public void testSubtract(){
		int subtract = calculator.subtract(215, 15);
		assertTrue(200 == subtract);
	}
	
	@Test
	public void testMultiply(){
		int product = calculator.multiply(20, 2);
		assertTrue(40 == product);
	}
	@Test
	public void testDivide(){
		int quotient = calculator.divide(90, 3);
		assertTrue(30 == quotient);
	}



}
