package com.arctro.ssn.protobuf.converters;

/**
 * Converts from F to T
 * @author Ben McLean
 *
 * @param <F> What to convert from
 * @param <T> What to convert to
 */
public interface Converter<F,T> {
	/**
	 * Converts F to T
	 * @param c What to convert
	 * @return The converted object
	 */
	public T convert(F c);
}
