package com.arctro.ssn.protobuf.models;

import com.google.protobuf.GeneratedMessageV3;

public interface ProtobufWrapper<T extends GeneratedMessageV3> {
	public T getBase();
}
