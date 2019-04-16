package NumberConverter.BackwardConverter;

import java.util.HashMap;
import java.util.Map;

import NumberConverter.BaseDataStructures.IBaseDataStructures;

public class BackwardConverter implements IBackwardConverter {
	@Override
	public int convertTonumber(String words, IBaseDataStructures baseDataStructures) {
		if(words.equals("zero")) return 0;
		int res = 0;
		Map<String, Integer> lessThanTwenty = new HashMap<>();
		Map<String, Integer> tens = new HashMap<>();
		Map<String, Integer> thousands = new HashMap<>();

		createMaps(baseDataStructures.getLessThanTwenty(), lessThanTwenty, baseDataStructures.getTens(), tens,
				baseDataStructures.getThousands(), thousands);

		String[] splittedWords = words.trim().split(" ");
		int left = 0, right = 0;
		for (right = 0; right < splittedWords.length; right++) {
			if (thousands.containsKey(splittedWords[right])) {
				res += (thousands.get(splittedWords[right])
						* helper(splittedWords, left, right - 1, 0, lessThanTwenty, tens));
				left = right + 1;
			}
		}
		if(!thousands.containsKey(splittedWords[right-1]))	//there is no word left
			res += helper(splittedWords, left, right - 1, 0, lessThanTwenty, tens);

		return res;
	}

	public int helper(String[] splittedWords, int left, int right, int res, Map<String, Integer> lessThanTwenty,
			Map<String, Integer> tens) {
		try {
			if (right - left >= 1 && splittedWords[left + 1].equals("hundred")) {
				res += lessThanTwenty.get(splittedWords[left]) * 100;
				if(splittedWords[right].equals("hundred")) return res; //	there is no word left
				left += 2;
			}
			if (right - left == 1) { // if there are still two words
				res += tens.get(splittedWords[left]);
			}
			if (tens.containsKey(splittedWords[right])) // if last word is thirty, forty etc..
				res += tens.get(splittedWords[right]);
			else 
				res += lessThanTwenty.get(splittedWords[right]); // if last word is under twenty
		}
		catch(Exception ex) {
			res = -1;
		}
		return res;
	}

	public void createMaps(String[] lessThanTwentyArr, Map<String, Integer> lessThanTwenty, String[] tensArr,
			Map<String, Integer> tens, String[] thousandsArr, Map<String, Integer> thousands) {
		for (int i = 1; i < lessThanTwentyArr.length; i++)
			lessThanTwenty.put(lessThanTwentyArr[i], i);
		for (int i = 1; i < tensArr.length; i++)
			tens.put(tensArr[i], i * 10);
		for (int i = 1; i < thousandsArr.length; i++)
			thousands.put(thousandsArr[i], (int) Math.pow(10, 3 * i));
	}
}
