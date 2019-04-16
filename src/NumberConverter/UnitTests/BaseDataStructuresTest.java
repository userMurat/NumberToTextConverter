package NumberConverter.UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import NumberConverter.BaseDataStructures.BaseDataStructures;
import NumberConverter.BaseDataStructures.IBaseDataStructures;

public class BaseDataStructuresTest {

	IBaseDataStructures iBaseDataStructuresTest = new BaseDataStructures();

	@Test
	public void testGetLessThanTwenty() {
		String[] check = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };
		assertArrayEquals(check, iBaseDataStructuresTest.getLessThanTwenty());
	}

	@Test
	public void testGetTens() {
		String[] check = new String[] { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };
		assertArrayEquals(check, iBaseDataStructuresTest.getTens());
	}

	@Test
	public void testGetThousands() {
		String[] check = new String[] { "", "thousand", "million", "billion" };
		assertArrayEquals(check, iBaseDataStructuresTest.getThousands());
	}

}
