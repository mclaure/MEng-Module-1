import com.calculator.operations.*;

public class Main {

	public static void main(String args[]) {
		//Creates a new calculator object and execute its methods
		Calculator calculator = new Calculator(75, 34);
		calculator.add();
		calculator.substract();		
		calculator.multiply();	
		calculator.divide();			
	}	
}