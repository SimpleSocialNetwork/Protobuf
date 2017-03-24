package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessage;

public class IProtobufWrapper<T extends GeneratedMessage> implements ProtobufWrapper<T> {

	T base;
	
	public IProtobufWrapper(T base) {
		super();
		this.base = base;
	}

	public T getBase() {
		return base;
	}
	
	

}
