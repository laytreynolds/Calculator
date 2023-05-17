package calculatorAPP;

import java.util.List;

public class DataValidation {

	public boolean isValidNumbers(List<String> inputs) {
		try {

			for (String input : inputs) {

				double number = Double.parseDouble(input);

			}
			return true; // Input is a valid number

		} catch (NumberFormatException e) {
			return false; // Input is not a valid number
		}
	}

}
