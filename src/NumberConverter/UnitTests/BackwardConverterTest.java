package NumberConverter.UnitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import NumberConverter.BackwardConverter.BackwardConverter;
import NumberConverter.BackwardConverter.IBackwardConverter;
import NumberConverter.BaseDataStructures.BaseDataStructures;
import NumberConverter.BaseDataStructures.IBaseDataStructures;

public class BackwardConverterTest {

	@Test
	public void testConvertTonumber() {
		IBackwardConverter backwardConverterTest = new BackwardConverter();
		IBaseDataStructures baseDataStructuresTest = new BaseDataStructures();

		assertEquals(0, backwardConverterTest.convertTonumber("zero", baseDataStructuresTest));

		assertEquals(5, backwardConverterTest.convertTonumber("five", baseDataStructuresTest));
		assertEquals(50, backwardConverterTest.convertTonumber("fifty", baseDataStructuresTest));
		assertEquals(15, backwardConverterTest.convertTonumber("fifteen", baseDataStructuresTest));

		assertEquals(100, backwardConverterTest.convertTonumber("one hundred", baseDataStructuresTest));
		assertEquals(506, backwardConverterTest.convertTonumber("five hundred six", baseDataStructuresTest));
		assertEquals(320, backwardConverterTest.convertTonumber("three hundred twenty", baseDataStructuresTest));
		assertEquals(5, backwardConverterTest.convertTonumber("five", baseDataStructuresTest));
		assertEquals(825, backwardConverterTest.convertTonumber("eight hundred twenty five", baseDataStructuresTest));
		assertEquals(230, backwardConverterTest.convertTonumber("two hundred thirty", baseDataStructuresTest));
		assertEquals(990, backwardConverterTest.convertTonumber("nine hundred ninety", baseDataStructuresTest));

		assertEquals(1000, backwardConverterTest.convertTonumber("one thousand", baseDataStructuresTest));
		assertEquals(2005, backwardConverterTest.convertTonumber("two thousand five", baseDataStructuresTest));
		assertEquals(6700, backwardConverterTest.convertTonumber("six thousand seven hundred", baseDataStructuresTest));
		assertEquals(5, backwardConverterTest.convertTonumber("five", baseDataStructuresTest));
		assertEquals(8013, backwardConverterTest.convertTonumber("eight thousand thirteen", baseDataStructuresTest));
		assertEquals(9999, backwardConverterTest.convertTonumber("nine thousand nine hundred ninety nine",
				baseDataStructuresTest));

		assertEquals(1000000, backwardConverterTest.convertTonumber("one million", baseDataStructuresTest));
		assertEquals(2990005, backwardConverterTest.convertTonumber("two million nine hundred ninety thousand five",
				baseDataStructuresTest));
		assertEquals(6001700, backwardConverterTest.convertTonumber("six million one thousand seven hundred",
				baseDataStructuresTest));
		assertEquals(5, backwardConverterTest.convertTonumber("five", baseDataStructuresTest));
		assertEquals(8019010,
				backwardConverterTest.convertTonumber("eight million nineteen thousand ten", baseDataStructuresTest));
		assertEquals(9005999, backwardConverterTest
				.convertTonumber("nine million five thousand nine hundred ninety nine", baseDataStructuresTest));

		assertEquals(1000000000, backwardConverterTest.convertTonumber("one billion", baseDataStructuresTest));
		assertEquals(2005870006, backwardConverterTest.convertTonumber(
				"two billion five million eight hundred seventy thousand six", baseDataStructuresTest));
		assertEquals(2147483647, backwardConverterTest.convertTonumber(
				"two billion one hundred forty seven million four hundred eighty three thousand six hundred forty seven",
				baseDataStructuresTest));
		assertEquals(5, backwardConverterTest.convertTonumber("five", baseDataStructuresTest));

		assertNotEquals(190, backwardConverterTest.convertTonumber("one hundred nineteen", baseDataStructuresTest));
		assertNotEquals(1000000, backwardConverterTest.convertTonumber("one billion", baseDataStructuresTest));
		assertNotEquals(90005999, backwardConverterTest
				.convertTonumber("nine million five thousand nine hundred ninety nine", baseDataStructuresTest));
		assertNotEquals(0, backwardConverterTest.convertTonumber("one", baseDataStructuresTest));
		assertNotEquals(1000, backwardConverterTest.convertTonumber("one hundred", baseDataStructuresTest));

	}
}
