package NumberConverter.ForwardConverter;

import NumberConverter.BaseDataStructures.IBaseDataStructures;

public class ForwardConverter implements IForwardConverter {
	@Override
	public String convertToWords(int num, IBaseDataStructures baseDataStructures) {
		if (num == 0)
			return "zero";

		int i = 0;
		String words = "";
		String[] lessThanTwenty = baseDataStructures.getLessThanTwenty();
		String[] tens = baseDataStructures.getTens();
		String[] thousands = baseDataStructures.getThousands();

		while (num > 0) {
			if (num % 1000 != 0)
				words = helper(num % 1000, lessThanTwenty, tens) + thousands[i] + " " + words;
			num /= 1000;
			i++;
		}

		return words.trim();
	}

	public String helper(int num, String[] lessThanTwenty, String[] tens) {
		if (num == 0)
			return "";
		else if (num < 20)
			return lessThanTwenty[num] + " ";
		else if (num < 100)
			return tens[num / 10] + " " + helper(num % 10, lessThanTwenty, tens);
		else
			return lessThanTwenty[num / 100] + " hundred " + helper(num % 100, lessThanTwenty, tens);
	}

}
