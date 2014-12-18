package com.moussi.demo;

public class CalculatorService {
	Icalculator cal;
	
	public int addTwoNumbers(int x,int y)
	{
		return cal.add(x, y);
	}

	public Icalculator getCal() {
		return cal;
	}

	public void setCal(Icalculator cal) {
		this.cal = cal;
	}
	
}
