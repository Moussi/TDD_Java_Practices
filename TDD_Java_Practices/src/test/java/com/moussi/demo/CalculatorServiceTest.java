package com.moussi.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class CalculatorServiceTest {
	
	CalculatorService calculator;
	@Before
	public void setUp() throws Exception {
		Icalculator cal= mock(Icalculator.class);
		when(cal.add(3, 3)).thenReturn(6);
		calculator=new CalculatorService();
		calculator.setCal(cal);
	}

	@Test
	public void addTwoNumbersTest() {
		assertEquals(6,calculator.addTwoNumbers(3, 3));
	}

}
