package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

public class IProtobufWrapper<T extends GeneratedMessageV3> implements ProtobufWrapper<T> {

	T base;
	
	public IProtobufWrapper(T base) {
		super();
		this.base = base;
	}

	public T getBase() {
		return base;
	}
	
	

}
