package com.app.dto;

public class CalculatorObj {


	private int opreand1;
	private int opreand2;
	private String operation;
	private int result;
	
	

	
	@Override
	public String toString() {
		return "CalculatorObj [opreand1=" + opreand1 + ", opreand2=" + opreand2 + ", operation=" + operation
				+ ", result=" + result + "]";
	}

	public CalculatorObj(int opreand1, int opreand2, String operation) {
		super();
		this.opreand1 = opreand1;
		this.opreand2 = opreand2;
		this.operation = operation;
	}

	public int getOpreand1() {
		return opreand1;
	}
	
	public void setOpreand1(int opreand1) {
		this.opreand1 = opreand1;
	}
	
	public int getOpreand2() {
		return opreand2;
	}
	
	public void setOpreand2(int opreand2) {
		this.opreand2 = opreand2;
	}
	
	public String getOperation() {
		return operation;
	}
	
	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setResult(int result) {
		this.result = result;
	}
	
	
}
