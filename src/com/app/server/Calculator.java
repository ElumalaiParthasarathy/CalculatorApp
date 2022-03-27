package com.app.server;

import com.app.dto.CalculatorObj;

public interface Calculator {
			
	public CalculatorObj addition(CalculatorObj calculatorObj);
	public  CalculatorObj subraction(CalculatorObj calculatorObj);
	public  CalculatorObj division (CalculatorObj calculatorObj);
	public CalculatorObj multiplication(CalculatorObj calculatorObj);
}
