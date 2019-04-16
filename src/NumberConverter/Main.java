package NumberConverter;

import java.util.Scanner;

import NumberConverter.BackwardConverter.IBackwardConverter;
import NumberConverter.BaseDataStructures.IBaseDataStructures;
import NumberConverter.Factory.Factory;
import NumberConverter.Factory.IFactory;
import NumberConverter.ForwardConverter.IForwardConverter;
import NumberConverter.IntegerValidator.IIntegerValidator;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IFactory factory = new Factory();

		IForwardConverter forwardConverter = factory.createForwardConverter();
		IBackwardConverter backwardConverter = factory.createBackwordConverter();
		IIntegerValidator integerValidator = factory.createIntegerValidator();
		IBaseDataStructures baseDataStructures = factory.createBaseDataStructures();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Number to Text Converter.");
		System.out.println("Assumptions of the project:");
		System.out.println("1- This converter only works between 0 - 2147483647 (max int value)");
		System.out.println("2- This converter is designed as case insensitive");
		System.out.println("3- This converter works for only dollars. Cents are discardedW");
		
		System.out.println("\n'q' to quit anytime.\n");

		String input = "", output = "";

		while (true) {
			System.out.println("Please enter number or words:");
			input = scanner.nextLine();
			if (input.equals("q"))
				break;
			if (integerValidator.validate(input))
				output = forwardConverter.convertToWords(Integer.parseInt(input), baseDataStructures);
			else
				output = String.valueOf(backwardConverter.convertTonumber(input.toLowerCase(), baseDataStructures));
			if(output.equals("-1"))
				output = "invalid input format!! \n";
			System.out.println(output);
		}
		System.out.println("GoodBye!!");
	}
}
