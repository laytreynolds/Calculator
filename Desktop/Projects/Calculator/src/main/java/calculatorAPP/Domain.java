package calculatorAPP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Domain {

	public void inputMethod() {

		List<String> numberInputs = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter inputs (type 'next' to finish):");
		String input = scanner.nextLine();

		while (!input.equalsIgnoreCase("next")) {
			numberInputs.add(input);
			input = scanner.nextLine();
		}

		System.out.println("Inputs:");
		for (String value : numberInputs) {
			System.out.println(value);

		}

		scanner.close();

		DataValidation validation = new DataValidation();

		validation.isValidNumbers(numberInputs);
		
		

	}

}
