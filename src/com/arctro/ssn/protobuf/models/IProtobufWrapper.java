package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

/**
 * A concrete implementation of {@link ProtobufWrapper}
 * @author Ben McLean
 *
 * @param <T> The protobuf message to wrap
 */
public class IProtobufWrapper<T extends GeneratedMessageV3> implements ProtobufWrapper<T> {

	T base;
	
	public IProtobufWrapper(T base) {
		super();
		this.base = base;
	}

	public T getBase() {
		return base;
	}

	@Override
	public String toString() {
		return "IProtobufWrapper [base=" + base.toString() + "]";
	}

}
