package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessage;

public class IServableProtobufWrapper<T extends GeneratedMessage> extends IProtobufWrapper<T> implements ServableProtobufWrapper<T> {
	Integer id;

	public IServableProtobufWrapper(T base, Integer id) {
		super(base);
		this.id = id;
	}

	public Integer getServerId() {
		return id;
	}
}
