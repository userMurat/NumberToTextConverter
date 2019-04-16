package NumberConverter.Factory;

import NumberConverter.BackwardConverter.BackwardConverter;
import NumberConverter.BackwardConverter.IBackwardConverter;
import NumberConverter.BaseDataStructures.BaseDataStructures;
import NumberConverter.BaseDataStructures.IBaseDataStructures;
import NumberConverter.ForwardConverter.ForwardConverter;
import NumberConverter.ForwardConverter.IForwardConverter;
import NumberConverter.IntegerValidator.IIntegerValidator;
import NumberConverter.IntegerValidator.IntegerValidator;

public class Factory implements IFactory {
	/* (non-Javadoc)
	 * @see NumberConverter.IFactory#createForwardConverter()
	 */
	@Override
	public IForwardConverter createForwardConverter() {
		return new ForwardConverter();
	}

	/* (non-Javadoc)
	 * @see NumberConverter.IFactory#createBackwordConverter()
	 */
	@Override
	public IBackwardConverter createBackwordConverter() {
		return new BackwardConverter();
	}

	/* (non-Javadoc)
	 * @see NumberConverter.IFactory#createIntegerValidator()
	 */
	@Override
	public IIntegerValidator createIntegerValidator() {
		return new IntegerValidator();
	}
	
	/* (non-Javadoc)
	 * @see NumberConverter.IFactory#createBaseDataStructures()
	 */
	@Override
	public IBaseDataStructures createBaseDataStructures() {
		return new BaseDataStructures();
	}
}
