package NumberConverter.IntegerValidator;

public class IntegerValidator implements IIntegerValidator {
	/* (non-Javadoc)
	 * @see NumberConverter.IIntegerValidator#isInteger(java.lang.String)
	 */
	@Override
	public boolean validate(String input) {
		try {
			int x = Integer.parseInt(input);
			if(x<0) return false;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}
