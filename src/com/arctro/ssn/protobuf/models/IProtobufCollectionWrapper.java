package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

/**
 * A concrete implementation of {@link ProtobufCollectionWrapper}
 * @author Ben McLean
 *
 * @param <T> The protobuf collection message to wrap
 */
public class IProtobufCollectionWrapper<T extends GeneratedMessageV3> extends IProtobufWrapper<T> implements ProtobufCollectionWrapper<T>{

	public IProtobufCollectionWrapper(T base) {
		super(base);
	}

	@Override
	public String toString() {
		return "IProtobufCollectionWrapper [base=" + base.toString() + "]";
	}
	
	
}
