package calc.model;

public class CalculatorMode {
	
	public float calculate(long number1, long number2, String operator){
		
		switch (operator) {
		case "+":
			return number1+number2;
		case "-":
			return number1-number2;
		case "x":
			return number1*number2;
		case "/":
			return number1/number2;
		default:
			return 0;
		}		
	}
}
