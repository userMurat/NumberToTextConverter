package NumberConverter.Factory;

import NumberConverter.BackwardConverter.IBackwardConverter;
import NumberConverter.BaseDataStructures.IBaseDataStructures;
import NumberConverter.ForwardConverter.IForwardConverter;
import NumberConverter.IntegerValidator.IIntegerValidator;

public interface IFactory {

	IForwardConverter createForwardConverter();

	IBackwardConverter createBackwordConverter();

	IIntegerValidator createIntegerValidator();

	IBaseDataStructures createBaseDataStructures();

}