package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CalculatorServiceTest {

	@Test
	public void testAdd() {
		int a=30,b=20;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.add(a,b), 50);
	}
	
	@Test
	public void testSubtract() {
		int a=30,b=20;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.subtract(a,b), 10);
	}
	
	@Test
	public void testMultiply() {
		int a=30,b=20;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.multiply(a,b), 600);
	}
	
	@Test
	public void testDivide() {
		int a=30,b=20;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.divide(a,b), 1);
	}
	
	@Test
	public void testRemainder() {
		int a=30,b=20;
		CalculatorService cs = new CalculatorService();
		Assertions.assertEquals(cs.remainder(a,b), 10);
	}
}