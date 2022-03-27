package com.app.server;

import com.app.dto.CalculatorObj;

interface AdvancedCalculator extends Calculator {
	
	public CalculatorObj modulus(CalculatorObj calculatorObj);

}
