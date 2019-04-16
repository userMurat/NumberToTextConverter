package NumberConverter.BaseDataStructures;

public class BaseDataStructures implements IBaseDataStructures {
	private String[] lessThanTwenty;
	private String[] tens;
	private String[] thousands;

	public BaseDataStructures() {
		lessThanTwenty = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };
		tens = new String[] { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		thousands = new String[] { "", "thousand", "million", "billion" };
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see NumberConverter.IBaseDataStructures#getLessThanTwenty()
	 */
	@Override
	public String[] getLessThanTwenty() {
		return lessThanTwenty;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see NumberConverter.IBaseDataStructures#getTens()
	 */
	@Override
	public String[] getTens() {
		return tens;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see NumberConverter.IBaseDataStructures#gethousands()
	 */
	@Override
	public String[] getThousands() {
		return thousands;
	}
}
