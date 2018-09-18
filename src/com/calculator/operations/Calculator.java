
package com.calculator.operations;

public class Calculator {
	int _a;
	int _b;
	
	public Calculator(int a, int b) {
		_a = a;
		_b = b;
		showMessage("Calculator Initialized with: a=" + a + " and b=" + b);		
	}

	public void add() {
		if(validNumbers(_a,_b)) {
			showResult("adition", (_a + _b));
		}
	}	
	
	public void substract() {
		if(validNumbers(_a, _b)) {
			if(_a > _b) {
				showResult("substraction", (_a - _b));
			}
			else {
				showMessage("Not a valid positive substraction");
			}	
		}
	}
	
	public void multiply() {
		if(validNumbers(_a,_b)) {
			showResult("multiply", (_a * _b));
		}
	}	
	
	public void divide() {
		if(validNumbers(_a, _b)) {
			if(_b != 0) {
				showResult("divide", (_a / _b));
			}
			else {
				showMessage("Not a valid divide");
			}	
		}
	}	
	
	private boolean validNumbers(int a, int b) {
		if((a > 0) && (b > 0)) {
			return true;
		}
		else {
			showMessage("Not a positive Number");
			return false;
		}	
	}	
	
	private void showResult(String operation, int result) {
		showMessage("The result of " + operation + " is: " + result);
	}
	
	private void showMessage(String message) {
		System.out.println(message);
	}	
}
