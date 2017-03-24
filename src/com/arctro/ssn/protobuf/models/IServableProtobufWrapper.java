package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

public class IServableProtobufWrapper<T extends GeneratedMessageV3> extends IProtobufWrapper<T> implements ServableProtobufWrapper<T> {
	Integer id;

	public IServableProtobufWrapper(T base, Integer id) {
		super(base);
		this.id = id;
	}

	public Integer getServerId() {
		return id;
	}
}
