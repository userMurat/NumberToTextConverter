package NumberConverter.UnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import NumberConverter.BaseDataStructures.BaseDataStructures;
import NumberConverter.BaseDataStructures.IBaseDataStructures;
import NumberConverter.ForwardConverter.ForwardConverter;
import NumberConverter.ForwardConverter.IForwardConverter;

public class ForwardConverterTest {

	@Test
	public void testConvertToWords() {
		IForwardConverter forwardConverterTest = new ForwardConverter();
		IBaseDataStructures baseDataStructuresTest = new BaseDataStructures();

		assertEquals("zero", forwardConverterTest.convertToWords(0, baseDataStructuresTest));

		assertEquals("five", forwardConverterTest.convertToWords(5, baseDataStructuresTest));
		assertEquals("fifty", forwardConverterTest.convertToWords(50, baseDataStructuresTest));
		assertEquals("fifteen", forwardConverterTest.convertToWords(15, baseDataStructuresTest));

		assertEquals("one hundred", forwardConverterTest.convertToWords(100, baseDataStructuresTest));
		assertEquals("five hundred six", forwardConverterTest.convertToWords(506, baseDataStructuresTest));
		assertEquals("three hundred twenty", forwardConverterTest.convertToWords(320, baseDataStructuresTest));
		assertEquals("eight hundred twenty five", forwardConverterTest.convertToWords(825, baseDataStructuresTest));
		assertEquals("two hundred thirty", forwardConverterTest.convertToWords(230, baseDataStructuresTest));
		assertEquals("nine hundred ninety", forwardConverterTest.convertToWords(990, baseDataStructuresTest));

		assertEquals("one thousand", forwardConverterTest.convertToWords(1000, baseDataStructuresTest));
		assertEquals("two thousand five", forwardConverterTest.convertToWords(2005, baseDataStructuresTest));
		assertEquals("six thousand seven hundred", forwardConverterTest.convertToWords(6700, baseDataStructuresTest));
		assertEquals("eight thousand thirteen", forwardConverterTest.convertToWords(8013, baseDataStructuresTest));
		assertEquals("nine thousand nine hundred ninety nine",
				forwardConverterTest.convertToWords(9999, baseDataStructuresTest));

		assertEquals("one million", forwardConverterTest.convertToWords(1000000, baseDataStructuresTest));
		assertEquals("two million nine hundred ninety thousand five",
				forwardConverterTest.convertToWords(2990005, baseDataStructuresTest));
		assertEquals("six million one thousand seven hundred",
				forwardConverterTest.convertToWords(6001700, baseDataStructuresTest));
		assertEquals("eight million nineteen thousand ten",
				forwardConverterTest.convertToWords(8019010, baseDataStructuresTest));
		assertEquals("nine million five thousand nine hundred ninety nine",
				forwardConverterTest.convertToWords(9005999, baseDataStructuresTest));

		assertEquals("one billion", forwardConverterTest.convertToWords(1000000000, baseDataStructuresTest));
		assertEquals("two billion five million eight hundred seventy thousand six",
				forwardConverterTest.convertToWords(2005870006, baseDataStructuresTest));
		assertEquals(
				"two billion one hundred forty seven million four hundred eighty three thousand six hundred forty seven",
				forwardConverterTest.convertToWords(2147483647, baseDataStructuresTest));

		assertNotEquals("one hundred nineteen", forwardConverterTest.convertToWords(190, baseDataStructuresTest));
		assertNotEquals("one billion", forwardConverterTest.convertToWords(1000000, baseDataStructuresTest));
		assertNotEquals("nine million five thousand nine hundred ninety nine",
				forwardConverterTest.convertToWords(90005999, baseDataStructuresTest));
		assertNotEquals(
				"two billion one hundred forty seven million four hundred eighty three thousand six hundred forty seven",
				forwardConverterTest.convertToWords(2147483646, baseDataStructuresTest));
		assertNotEquals("one", forwardConverterTest.convertToWords(0, baseDataStructuresTest));
		assertNotEquals("one hundred", forwardConverterTest.convertToWords(1000, baseDataStructuresTest));

	}

}
