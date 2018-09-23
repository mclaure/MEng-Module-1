
package com.calculator.operations;

public class Calculator {
	int _firstNumber; //First Number value that is going to be calculate
	int _secondNumber;//Second Number value that is going to be calculate
	
	/*
	 * Initialize the _firstNumber and _secondNumber
	 * */
	public Calculator(int firstNumber, int secondNumber) {
	    _firstNumber = firstNumber;
		_secondNumber = secondNumber;
		showMessage("Calculator Initialized with [First Number=" + firstNumber + " , Second Number=" + secondNumber + "]");		
	}

	/*
	 * Ads _firstNumber and _secondNumber
	 * */
	public void add() {
		if(isAPositiveNumber(_firstNumber) && isAPositiveNumber(_secondNumber)) {
			showMessage("adition", (_firstNumber + _secondNumber));
		}
	}	
	/*
	 * Substract _firstNumber and _secondNumber
	 * */	
	public void substract() {
		if(isAPositiveNumber(_firstNumber) && isAPositiveNumber(_secondNumber)) {
			if(_firstNumber > _secondNumber) {
				showMessage("substraction", (_firstNumber - _secondNumber));
			}
			else {
				showMessage("Not a valid positive substraction");
			}	
		}
	}
	/*
	 * Substract _firstNumber and _secondNumber
	 * */	
	public void multiply() {
		if(isAPositiveNumber(_firstNumber) && isAPositiveNumber(_secondNumber)) {
			showMessage("multiply", (_firstNumber * _secondNumber));
		}
	}	
	/*
	 * Substract _firstNumber and _secondNumber
	 * */	
	public void divide() {
		if(isAPositiveNumber(_firstNumber) && isAPositiveNumber(_secondNumber)) {
			if(_secondNumber > 0) {
				showMessage("divide", (_firstNumber / _secondNumber));
			}
			else {
				showMessage("Not a valid divide");
			}	
		}
	}	
	/*
	 * validate a positive number on TRUE
	 * */	
	private boolean isAPositiveNumber(int value) {
		if(value > 0) {
			return true;
		}
		else {
			showMessage("Not a positive Number");
			return false;
		}	
	}	

	/*
	 * Shows a compound message indicating operation executed and its result 
	 * */
	private void showMessage(String operation, int result) {
		showMessage("The result of " + operation + " is: " + result);
	}
	
	/*
	 * Shows a compound message
	 * */
	private void showMessage(String message) {
		System.out.println(message);
	}	
}
