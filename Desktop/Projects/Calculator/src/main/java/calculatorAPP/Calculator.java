package calculatorAPP;

public class Calculator {

	public static double result;
	
	public double addition(double firstNumber, double secondNumber) {

		result = firstNumber + secondNumber; 
		
		return result;
	}

	public double subtraction(double firstNumber, double secondNumber) {

		result = firstNumber - secondNumber;

		return result;
	}

	public double multiplication(double firstNumber, double secondNumber) {

		result = firstNumber * secondNumber;
		return result;
	}

	public double division(double firstNumber, double secondNumber) {

		result = firstNumber / secondNumber;
		return result;

	}

}
