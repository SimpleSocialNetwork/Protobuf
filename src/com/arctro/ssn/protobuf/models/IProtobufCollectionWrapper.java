package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

public class IProtobufCollectionWrapper<T extends GeneratedMessageV3> extends IProtobufWrapper<T> implements ProtobufCollectionWrapper<T>{

	public IProtobufCollectionWrapper(T base) {
		super(base);
	}
	
}