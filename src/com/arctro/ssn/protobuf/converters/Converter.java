package com.arctro.ssn.protobuf.converters;

public interface Converter<F,T> {
	public T convert(F c);
}
