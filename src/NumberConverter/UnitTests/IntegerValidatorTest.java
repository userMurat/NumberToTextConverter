package NumberConverter.UnitTests;

import static org.junit.Assert.*;

import org.junit.Test;

import NumberConverter.IntegerValidator.IIntegerValidator;
import NumberConverter.IntegerValidator.IntegerValidator;

public class IntegerValidatorTest {

	@Test
	public void testValidate() throws Exception {
		IIntegerValidator integerValidatorTest = new IntegerValidator();
		assertEquals(false, integerValidatorTest.validate(""));
		assertEquals(false, integerValidatorTest.validate("-1"));
		assertEquals(true, integerValidatorTest.validate("123"));
		assertEquals(true, integerValidatorTest.validate(String.valueOf(Integer.MAX_VALUE)));
		assertEquals(false, integerValidatorTest.validate(String.valueOf(Integer.MIN_VALUE)));

	}

}
