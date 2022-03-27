package com.app;


import java.util.Scanner;

import com.app.dto.CalculatorObj;
import com.app.server.BaseCalculator;



public class CalculatorApp {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the operation");
		String opreation = sc.nextLine().toLowerCase();
		
		System.out.println("Enter The Oprend1 ");
		int opreand1 =  sc.nextInt();
		
		System.out.println("Enter the oprend2 ");
		int opreand2 =  sc.nextInt();
		sc.close();
		
		CalculatorObj calculatorObj = new CalculatorObj(opreand1, opreand2, opreation);
		BaseCalculator cal = new BaseCalculator();
		
	
	switch(opreation)	
	{ 
	case "add"  :
		cal.addition(calculatorObj);
		break;
	case "sub":
		cal.subraction(calculatorObj);
		break;
	case "mul":
		cal.multiplication(calculatorObj);
		break;
	case "div":
		cal.division(calculatorObj);
		break;
//	case "mod":
//		cal.modulus(calculatorObj);
//		break;
	}
	System.out.println(calculatorObj.toString());
	

	}

}
