package aQute.bnd.build.model.conversions;

import aQute.bnd.build.model.*;

public final class EEFormatter implements Converter<String,EE> {
	public String convert(EE input) throws IllegalArgumentException {
		return input != null ? input.getEEName() : null;
	}

	@Override
	public String error(String msg) {
		return msg;
	}
}
