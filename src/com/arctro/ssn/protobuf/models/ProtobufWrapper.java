package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessage;

public interface ProtobufWrapper<T extends GeneratedMessage> {
	public T getBase();
}
